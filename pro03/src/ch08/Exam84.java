package ch08;

import java.util.Scanner;

/*
 * 예외
 * 1.예외처리 :try~catch~finally
 * 2.예외발생 :throw 내가 만들어내는 오류,프로그램상 오류
 * 3.예외전가 :throws
 */

public class Exam84 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("x:");
		int x=sc.nextInt();
		
		System.out.print("y");
		int y=sc.nextInt();
		
		try {
			int z=x/y;
			System.out.println(x+","+y+","+z);
		} catch (ArithmeticException e) {
			System.out.println("0입력안됨");
		}
		
		sc.close();
	}
}
