package ch02;

public class Exam11 {
	public static void main(String[] args) {
		int a=-25;
		
		if(a>0){
			System.out.println("���");
		}else{
			System.out.println("����");
		}
		
		String str=a>0 ?"���":"����";
		System.out.println("str:"+str);
		
		if(a%2==0){
			System.out.println("¦���Դϴ�."+a);
		}else{
			a*=200;
			System.out.println("Ȧ���Դϴ�."+a);
		}
	}
}
