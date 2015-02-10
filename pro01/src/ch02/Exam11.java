package ch02;

public class Exam11 {
	public static void main(String[] args) {
		int a=-25;
		
		if(a>0){
			System.out.println("양수");
		}else{
			System.out.println("음수");
		}
		
		String str=a>0 ?"양수":"음수";
		System.out.println("str:"+str);
		
		if(a%2==0){
			System.out.println("짝수입니다."+a);
		}else{
			a*=200;
			System.out.println("홀수입니다."+a);
		}
	}
}
