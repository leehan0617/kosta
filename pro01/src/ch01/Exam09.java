package ch01;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=a!=b?a:b;
		System.out.println(c);
		
		int d=10;
		System.out.println(d==10? "T":"F");
		int i=100;
		System.out.println(i+=2); // i=i+2;
		System.out.println(i-=2); // i=i-2;
		System.out.println(i*=2); // i=i*2;
		System.out.println(i/=2); // i=i/2;
		
		int x=10,y=20,z=30;
		System.out.println(x+""+y+""+z); 
		
		System.out.println("--------------");
		int su=10;
		int value=20;
		System.out.println(su);
		System.out.println("su:"+su);
		System.out.println("su"+su+value);//문자열+정수형 = 문자열
		System.out.println("su"+(su+value));
		System.out.println(su+" "+value);
		
	}

}
