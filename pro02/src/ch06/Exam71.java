package ch06;

class ParentsC{
	protected int x,y;
	
	public ParentsC(){
		System.out.println("부모 기본생성자");
	}
	
	public ParentsC(int x){
		this.x=x;
		this.y=20;
	}
	
	public ParentsC(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class SonD extends ParentsC{
	private int z;
	
	public SonD(){
		super();
		System.out.println("자식 기본생성자");
	}
	
	public SonD(int x){
		super(x);
		this.y=20;
	}
	
	public SonD(int x,int y){
		super(x,y);
		this.z=20;
	}
	
	public SonD(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y + "\t" + z);
	}
}

public class Exam71 {
	public static void main(String[] args) {
		//SonD a=new SonD();
		SonD b=new SonD(10);
		SonD c=new SonD(100,200,300);
		
		b.disp();
		c.disp();
	}
}
