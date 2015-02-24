package ch06;

class ParentsB{
	protected int x;
	protected int y;
}

class SonB extends ParentsB{
	private int z;
	
	public SonB(){
		System.out.println("기본생성자");
	}
	
	public SonB(int x){
		super.x=x;
		super.y=20;
		this.z=30;
	}
	
	public SonB(int x,int y){
		super.x=x;
		super.y=y;
		this.z=77;
	}
	
	public SonB(int x,int y,int z){
		super.x=x;
		super.y=y;
		this.z=z;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y + "\t" + z);
	}
}

public class Exam70 {
	public static void main(String[] args) {
		//SonB a=new SonB();
		SonB b=new SonB(10);
		SonB c=new SonB(66,88);
		SonB d=new SonB(1,2,3);
		
		b.disp();
		c.disp();
		d.disp();
	}
}
