package ch09;

/*
 *  java.lang
 *  	일반 자료형(byte,short,int,long,float,double,char,boolean)
 *   	클래스(변수,함수) -->Wrapper Class(Byte,Short,Integer,Long,
 *   					  Float,Double,Char,Boolean)
 */

public class Exam95 {
	public static void main(String[] args) {
		Byte y=new Byte((byte)10); //byte x=10; Byte y=new Byte(x);
//		byte z=y; error
		byte z=y.byteValue();
		System.out.println("y:"+ y + "z:" + z);
		
		Short s=new Short((short)123);
		System.out.println("short:" + s.shortValue());
	}
}
