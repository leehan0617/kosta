package ch09;

class CC{
	private int x;
	
	public CC(int x){
		this.x=x;
	}
	
	public void disp(){
		System.out.println("x:" + x);
	}
	
	public boolean equals(Object obj){
		boolean result=false;
		
		CC d=(CC)obj;
		if(this.x==d.x){
			result=true;
		}
//		upCast Parents p=new Son();
//		downCast Sons s=(Son)new Parents();
		return result;
	}
}
public class Exam92 {
	public static void main(String[] args) {
		String a=new String("hi");
		String b=new String("ho");
		
		if(a.equals(b)){
			System.out.println("a==b");
		}else{
			System.out.println("a!=b");
		}
		
		CC c=new CC(10);
		CC d=new CC(10);
		
		if(c.equals(d)){ //d.equals(c);
			System.out.println("c==d");
		}else{
			System.out.println("c!=d");
		}
	}
}
