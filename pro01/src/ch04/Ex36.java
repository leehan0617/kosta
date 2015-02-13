package ch04;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x;
		System.out.print("숫자 하나를 입력하세요:(1~3)");
		x=scan.nextInt();
		
		if(x==1){
			aa();
		}else if(x==2){
			bb();
		}else if(x==3){
			cc();
		}
		System.out.println("end");
		scan.close();
	}
	
	public static void aa(){
		System.out.println("AA Function");
	}
	public static void bb(){
		System.out.println("BB Function");
	}
	public static void cc(){
		System.out.println("CC Function");
	}

}
