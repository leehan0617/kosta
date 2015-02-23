package ch06;

class ParentsA{
	protected int x,y;
	protected char z;
	
	public void sub(){
		System.out.println("hahaha" + "\n");
	}
	
	public void aa(){
	}
}

class SonA extends ParentsA{
	protected int a,b;
	
	public void setData(int x,int y,char z,int a,int b){
		super.x=x;
		super.y=y;
		super.z=z;
		this.a=a;
		this.b=b;
	}
	
	public void disp(){
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println();
		
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
		System.out.println();
		
		System.out.println(z);
		System.out.println(this.z);
		System.out.println(super.z);
		System.out.println();
		
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public void bb(){
		super.aa();
		super.sub();
	}
}

public class Exam69 {
	public static void main(String[] args) {
		ParentsA p=new ParentsA();
		p.sub();
		
		SonA s=new SonA();
		s.setData(10, 20, 'A', 77, 88);
		s.sub();
		s.disp();
	}
}
