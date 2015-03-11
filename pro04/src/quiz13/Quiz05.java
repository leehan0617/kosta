package quiz13;

class Bank{													
	private int balance;
	
	public Bank(int balance){
		this.balance=balance;
		System.out.println("���°� ����������ϴ�:" + this.balance);
	}
	
	public synchronized void addBank(int money){					
		super.notify();
		balance += money;
	}	
	
	public synchronized void minusBank(int money){
		while(balance < money){
			try {
				System.out.println("�ܾ��� �����Ͽ� �켱 �����");
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
		System.out.println("�Ա�[" + money + "] : �ܾ� ["+ bank.getBalance() + "]");
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
		System.out.println("���["+ money + "] :  �ܾ� ["+ bank.getBalance() + "]");
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