package ch01;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		short b=a; 		//에러는 아니지만 기억공간 낭비
		System.out.println("b:" + b + " a:" + a);
		
		short c=20;
		byte d=(byte)c;
		System.out.println("d:" + d);
		
		float i=24.5f;
		double j=i;
		float k=(float)j;
		System.out.println(k);
		
		int su1=10;
		float su2=24.5f;
		float su3=su1+su2;
		System.out.println(su3);
		
		int value=10;
		float result=(float)value/3; // 10.0f/3 or value/(float)3
		System.out.println(result);
		
		

	}

}
