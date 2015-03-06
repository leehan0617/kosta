package quiz02;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		System.out.print("키를 입력하세요:");
		float ki=sc.nextFloat();
		
		System.out.print("몸무게를 입력하세요:");
		float w=sc.nextFloat();
		
		if(w > (ki-100)*0.9)
			System.out.println("당신은 다이어트가 필요합니다.");
		else 
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		
		sc.close();
	}
}
