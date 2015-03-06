package quiz02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요:");
		int first=sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요:");
		int second=sc.nextInt();
		
		if(first > second){
			System.out.println("first=" + first);
		}else {
			System.out.println("second=" + second);
		}
		
		sc.close();
	}
}
