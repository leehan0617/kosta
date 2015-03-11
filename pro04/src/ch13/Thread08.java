package ch13;

import java.util.Stack;

//자판기 동기화(기계,생산자,소비자)
//공유데이터:자판기 스레드:생산자,소비자
//임계영역:synchronized,notify,wait

class AutoMachine{
	private Stack<String> store=new Stack<String>();
	
	public synchronized void setDrink(String drink){  //관리자
		super.notify();
		store.push(drink);
	}
	
	public synchronized String getDrink(){
		while(store.isEmpty()){
			try{
				super.wait();
			}catch(InterruptedException e){ //고객
				e.printStackTrace();
			}
		}
		return store.pop();
	}
}

class Admin extends Thread{
	private AutoMachine am;
	
	public Admin(AutoMachine am){
		this.am=am;
	}
	
	public void run(){
		for(int i=1;i<11;i++){
			am.setDrink("음료수"+i);
			System.out.println("음료수"+i+"가 추가되었습니다.");
			
			try{
				super.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Customer extends Thread{
	private AutoMachine am;
	private String name;
	
	public Customer(String name,AutoMachine am){
		this.name=name;
		this.am=am;
	}
	
	public void run(){
		for(int i=1;i<11;i++){
			System.out.println(name+"이"+am.getDrink()+"을꺼내먹음");
			
			try{
				super.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Thread08 {
	public static void main(String[] args) throws InterruptedException {
		AutoMachine machine=new AutoMachine();
		Admin admin=new Admin(machine);
		Customer c1=new Customer("손님1",machine);
		Customer c2=new Customer("손님2",machine);
		Customer c3=new Customer("손님3",machine);
		
		admin.start();
		Thread.sleep(3000);
		c1.start();
		Thread.sleep(3000);
		c2.start();
		Thread.sleep(3000);
		c3.start();
	}
}