package ch07;

class CC{
	private int x=100;
	private static int y=200;
	private final int z=300;
	private static final int t=400;
	
	public void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(t);
	}
	
	public static void aa(){
//		System.out.println(x); error
		System.out.println(y);
//		System.out.println(z); error
		System.out.println(t);
	}
	
	public final void bb(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(t);
	}
	
	class DD{
		private int a=1;
//		private static int b=2; error
		private final int c=3;
//		private static final int d=4; error
		
//		public static void xx(){} error
		
		public final void yy(){}

		public void print(){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(t);
			
			disp();aa();bb();
		}
	}
}

public class Exam78 {
	public static void main(String[] args) {
		CC x=new CC();      //x,y,z,t,disp(),aa(),bb() 
		CC.DD y=x.new DD(); 
		y.print();
	}
}