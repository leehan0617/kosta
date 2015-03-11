package ch13;

import java.util.Stack;

//���Ǳ� ����ȭ(���,������,�Һ���)
//����������:���Ǳ� ������:������,�Һ���
//�Ӱ迵��:synchronized,notify,wait

class AutoMachine{
	private Stack<String> store=new Stack<String>();
	
	public synchronized void setDrink(String drink){  //������
		super.notify();
		store.push(drink);
	}
	
	public synchronized String getDrink(){
		while(store.isEmpty()){
			try{
				super.wait();
			}catch(InterruptedException e){ //��
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
			am.setDrink("�����"+i);
			System.out.println("�����"+i+"�� �߰��Ǿ����ϴ�.");
			
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
			System.out.println(name+"��"+am.getDrink()+"����������");
			
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
		Customer c1=new Customer("�մ�1",machine);
		Customer c2=new Customer("�մ�2",machine);
		Customer c3=new Customer("�մ�3",machine);
		
		admin.start();
		Thread.sleep(3000);
		c1.start();
		Thread.sleep(3000);
		c2.start();
		Thread.sleep(3000);
		c3.start();
	}
}