package ch06;

class ParentsF{
	protected int x,y;
	
	public ParentsF(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void yonsan(){
		System.out.println("hap:" + (x+y));
	}
}

class SonF extends ParentsF{
	public SonF(int x,int y){
		super(x,y);
	}
	
	public void yonsan(){
		System.out.println("cha:" + (x-y));
	}
}

public class Exam73 {
	public static void main(String[] args) {
		ParentsF p=new ParentsF(10,20);
		p.yonsan();
		
		SonF s=new SonF(77,88);
		s.yonsan();
		
		ParentsF p2=new SonF(10,20);
		p2.yonsan();
	}
}
