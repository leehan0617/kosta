package quiz02;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int plusCount=0, minusCount=0;
		
		for(int i=0;i<10;i++){
			System.out.print("수를 입력하세요:");
			int su=sc.nextInt();
			if(su > 0){
				plusCount++;
			}else{
				minusCount++;
			}
		}

		System.out.println("양수개수:" + plusCount);
		System.out.println("음수개수:" + minusCount);
		
		sc.close();
	}
}
