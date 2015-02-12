package quiz02;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("몇개의 수를 입력받겠습니까?");
		int suCount=sc.nextInt();
		
		int sum=0;		
		for(int i=0;i<suCount;i++){
			System.out.print("수를 입력하세요:");
			int su=sc.nextInt();
			sum+=su;
		}
		
		float avg=(float) sum/3;
		System.out.println("sum:" + sum + "\t" + "avg:" + avg);
		
		sc.close();
	}
}
