package quiz13;

class Bank{													
	private int balance;
	
	public Bank(int balance){
		this.balance=balance;
		System.out.println("계좌가 만들어졌습니다:" + this.balance);
	}
	
	public synchronized void addBank(int money){					
		super.notify();
		balance += money;
	}	
	
	public synchronized void minusBank(int money){
		while(balance < money){
			try {
				System.out.println("잔액이 부족하여 우선 대기중");
				super.wait();			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
	}
	
	public int getBalance(){											
		return balance;
	}
}

class InMoeny extends Thread{				
	private int money;
	private Bank bank;	
	
	public InMoeny(Bank Bank, int money){
		this.bank=Bank;
		this.money=money;
	}	
	public void run(){
		bank.addBank(money);
		System.out.println("입금[" + money + "] : 잔액 ["+ bank.getBalance() + "]");
	}
}

class OutMoeny extends Thread{			
	private int money;
	private Bank bank;	
	public OutMoeny(Bank bank, int money){
		this.bank=bank;
		this.money=money;
	}	
	public void run(){
		bank.minusBank(money);
		System.out.println("출금["+ money + "] :  잔액 ["+ bank.getBalance() + "]");
	}
}

public class Quiz05 {
	public static void main(String[] args) throws InterruptedException {
		Bank bank=new Bank(1000);
		
		new InMoeny(bank,10).start();
		Thread.sleep(1000);
		
		new OutMoeny(bank,100).start();
		Thread.sleep(1000);
		
		new InMoeny(bank,50).start();
		Thread.sleep(1000);
		
		new OutMoeny(bank,900).start();
		Thread.sleep(1000);
	}
}