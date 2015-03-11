package ch13;

class BB extends Thread{
	public BB(String name){
		super(name);
	}
	
	public void run(){
		System.out.println(super.getName() + "�켱����:"+Thread.currentThread().getPriority());
	}
}

public class Thread06 {
	public static void main(String[] args) {
		BB a=new BB("A thread"); //�켱���� 10�̰��� ���� 1�� ���峷�� default:5
		BB b=new BB("B thread"); //�켱������ ��Ȯ���� �ʴ� �ü�� �����층 ������
		BB c=new BB("C thread");
		BB d=new BB("D thread");
		
		a.start();
		b.setPriority(1);
		b.start();
		c.setPriority(10);
		c.start();
		d.setPriority(5);
		d.start();
	}
}