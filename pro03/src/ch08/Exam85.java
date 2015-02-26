package ch08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam85 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("x:");
			int x=sc.nextInt();
			
			System.out.print("y:");
			int y=sc.nextInt();
			
			int z=x/y;
			System.out.println(x + "," + y + "," + z);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����.");
		} catch (InputMismatchException e) {
			System.out.println("������ �Է°���");
		}
		
		sc.close();
	}
}
