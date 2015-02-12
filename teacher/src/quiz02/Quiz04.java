package quiz02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("어른 인원수:");
		int adult=sc.nextInt();
		
		System.out.print("청년 인원수:");
		int student=sc.nextInt();
		
		System.out.print("어린이 인원수 :");
		int child=sc.nextInt();
		
		int sum=0;
		
		if(adult >=5){
			sum=(adult*300)+(student*200)*(child*50);
		}else{
			sum=(adult*300)+(student*200)*(child*100);
		}
		
		System.out.println("출력결과:" + sum);
		
		sc.close();
	}
}










