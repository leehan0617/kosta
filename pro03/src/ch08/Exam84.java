package ch08;

import java.util.Scanner;

/*
 * ����
 * 1.����ó�� :try~catch~finally
 * 2.���ܹ߻� :throw ���� ������ ����,���α׷��� ����
 * 3.�������� :throws
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
			System.out.println("0�Է¾ȵ�");
		}
		
		sc.close();
	}
}
