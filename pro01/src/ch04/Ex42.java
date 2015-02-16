package ch04;

import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int kor=0;
		int math=0;
		int eng=0;
		int tot=0;
		float avg=0.0f;
		
		System.out.print("KOREAN:");
		kor=scan.nextInt();
		System.out.print("MATH:");
		math=scan.nextInt();
		System.out.print("ENGLISH:");
		eng=scan.nextInt();
		scan.close();
		
		tot=total(kor,math,eng);
		avg=average(tot);
		System.out.println("TOTAL:"+tot);
		System.out.println("AVERAGE:"+avg);
	}
	
	public static int total(int a,int b,int c){
		int tot=a+b+c;
		return tot;
	}
	public static float average(int tot){
		return tot/3.0f;
	}

}
