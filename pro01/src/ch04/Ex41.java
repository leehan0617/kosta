package ch04;

public class Ex41 {
	public static void main(String[] args) {
		int a=sub1(); // int a = 10;
		float b=sub2();
		String c=sub3();
		int d=sub4(10,20);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static int sub1(){
		int x=10;
		return x;
	}
	
	public static float sub2(){
		float y=10.0f;
		return y;
	}
	
	public static String sub3(){
		String z="HI";
		return z;
	}
	public static int sub4(int x,int y){
		return x+y;
	}
}
