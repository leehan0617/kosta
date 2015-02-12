package quiz02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("성별을 입력하세요:");
		int su=sc.nextInt();
		
		if(su==1){
			System.out.println("남자");
		}else if(su==2){
			System.out.println("여자");
		}		
		sc.close();
	}
}
