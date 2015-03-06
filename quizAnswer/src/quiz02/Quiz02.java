package quiz02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("수를입력하세요:");
		int su=sc.nextInt();
		
		if(su > 10 && su <20){
			System.out.println("su:" + su);
		}
			
		sc.close();
	}
}
