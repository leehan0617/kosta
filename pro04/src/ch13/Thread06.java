package ch13;

class BB extends Thread{
	public BB(String name){
		super(name);
	}
	
	public void run(){
		System.out.println(super.getName() + "우선순위:"+Thread.currentThread().getPriority());
	}
}

public class Thread06 {
	public static void main(String[] args) {
		BB a=new BB("A thread"); //우선순위 10이가장 높고 1이 가장낮다 default:5
		BB b=new BB("B thread"); //우선순위가 정확하지 않다 운영체제 스케쥴링 때문에
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