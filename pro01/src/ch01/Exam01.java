package ch01;

public class Exam01 {
	public static void main(String[] args){
		System.out.println("Hello Java");
		System.out.println("How are you");
		System.out.println("ha ha ha");
		System.out.println();
		System.out.println("정수형 자료형");
		
		byte a=10; 	 	 //1byte(-128~127)
		short b=128; 	 //2byte(-32768~32767)
		int c=1000;	 	 //4byte(-2147483648~2147483647)
		long d=6580L;	 //8byte(-2^63~2^63-1)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		System.out.println("실수형 자료형");
		float e=45.4f;   //4byte(1.4E-45 ~ 3.4082E38)
		double f=120.40; //8byte(4.92E-324 ~ 1.8E308)
		
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("문자형 자료형");
		char x='A';  //2byte
		char y='김';
		System.out.println("x:" + x + "\t" +"y:" + y);
		
		System.out.println("문자열 자료형");
		String str1="Hello java"; //무한참조형
		String str2="How are you";
		String str3="힘들어요";
		
		System.out.println("str1:" + str1 + " str2:" + str2 + " str3:" + str3);
		
		System.out.println("논리형 자료형");
		boolean b1=true; 	//1byte true(1)
		boolean b2=false;	//false(0)
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(10); //System byte : 8byte(64bit)
	}
}
