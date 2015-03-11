package quiz13;

class Bank{
	private int money;
	
	public Bank(int money){
		this.money=money;
		System.out.println("°èÁÂ°¡ ¸¸µé¾îÁ³½À´Ï´Ù. ÀÜ¾×:"+money);
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}

class InMoney extends Thread{
	private int money;
	private Bank bank;
	
	public InMoney(Bank bank,int money){
		this.bank=bank;
		this.money=money;
	}
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized int income(){
		int result;
		result=bank.getMoney()+money;
		super.notifyAll();
		return result;
	}
	public synchronized void run(){
		System.out.println("ÀÔ±İ["+money+"] : ÀÜ¾× ["+income()+"]");
		bank.setMoney(income());
	}
}

class OutMoney extends Thread{
	private int money;
	private Bank bank;
	
	public OutMoney(Bank bank,int money) {
		this.bank=bank;
		this.money=money;
	}
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public synchronized int withdraw(){
		int result;
		result=bank.getMoney()-money;
		if(result<0){
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public void run(){
		System.out.println("Ãâ±İ["+money+"] : ÀÜ¾× ["+withdraw()+"]");
		bank.setMoney(withdraw());
	}
	
}

public class Quiz05{
	public static void main(String[] args) throws InterruptedException {
		Bank bank=new Bank(1000);
		
		new InMoney(bank,10).start();
		Thread.sleep(1000);
		
		new OutMoney(bank,1600).start();
		Thread.sleep(1000);
		
		new InMoney(bank,500).start();
		Thread.sleep(1000);
		
		new OutMoney(bank,70).start();
		Thread.sleep(1000);
		
		new InMoney(bank,700).start();
		Thread.sleep(1000);
		
		new OutMoney(bank,500).start();
		Thread.sleep(1000);
	}
}