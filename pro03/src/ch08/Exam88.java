package ch08;

import java.util.Scanner;

public class Exam88 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("x:");
			int x=sc.nextInt();
			
			System.out.print("y:");
			int y=sc.nextInt();
			
			int z=x/y;
			System.out.println(x + "," + y + "," + z);
		} catch (Throwable e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		
		sc.close();
	}
}
