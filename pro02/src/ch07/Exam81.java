package ch07;

class EE{
	private int x=100;
	private static int y=200;
	
	public void disp(){
		System.out.println(x+","+y);
	}
	public static void aa(){
//		System.out.println(x+","+y); error
		System.out.println(y);
	}
	
	static class FF{
		public int a=77;
		public static int b=88;
		
		public void print(){
			System.out.println("a:"+a);
			System.out.println("b:"+b);
//			System.out.println("x:"+x); error
			System.out.println("y:"+y);
		}
	}
}

public class Exam81 {
	public static void main(String[] args) {
		EE e=new EE();
		e.disp();
		
		EE.FF f=new EE.FF();
		f.print();
	}
}
