package ch01;

public class Exam02 {
	public static void main(String[] args){
		boolean a=false;
		boolean b=!a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int c=~10; //��Ʈ(����)����
		// 0000 1010 --> 1111 0101 = -11
		System.out.println("c:"+c);
		
		int d=~-15;
		// 1111 0001 --> 0000 1110 = 14
		System.out.println("d:"+d);
	}
}
