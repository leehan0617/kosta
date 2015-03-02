package ch09;

public class Exam105 {
	public static void main(String[] args) {
		double x=123.456;
		float y=123.56f;
		
		long a=Math.round(x);
		System.out.println("a:" + a);
		
		long b=Math.round(y);
		System.out.println("b:" + b);
		
		//올림
		int c=(int)Math.ceil(x);
		System.out.println("c:" + c);
		
		//버림
		int d=(int)Math.floor(y);
		System.out.println("d:" + d);
		
		//둘째자리에서 반올림
		int e=(int)(Math.round(x)*10.0/10.0);
		System.out.println("e:" + e);
		
		//셋째자리에서 반올림
		int f=(int)(Math.round(y)*100.0/100.0);
		System.out.println("f:" + f);
		
		double g=Math.PI;
		System.out.println("g:" + g);
		
		double h=Math.sin(Math.PI);
		System.out.println("h:" + h);
		
		double i=Math.cos(Math.PI);
		System.out.println("i:" + i);
		
		double j=Math.tan(Math.PI);
		System.out.println("j:" + j);
	}

}
