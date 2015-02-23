package ch05;

class TestX{
	private int x, y, z, a;
	
	public TestX(){
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public TestX(int x){
		this();
		this.x=x;
	}
	
	public TestX(int x,int y){
		this(x);
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y + "\t" + z + "\t" + a);
		sub();
	}
	
	public void sub(){
		
	}
}

public class Ex62 {
	public static void main(String[] args) {
		TestX t=new TestX();
		t.disp();
		
		TestX t2=new TestX(40,20);
		t2.disp();
		
		TestX t3=new TestX(10);
		t3.disp();
	}
}
