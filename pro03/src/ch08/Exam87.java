package ch08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam87 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("x:");
			int x=sc.nextInt();
			
			System.out.print("y:");
			int y=sc.nextInt();
			
			System.out.println(x + "\t" + y);
		}catch(InputMismatchException e){
			System.out.println("������ �Է�");
//			System.out.println(e);
//			System.out.println(e.getMessage()); 
			e.printStackTrace();  //�߻��� ���帹�̾���
		}
		
		sc.close();
	}
}
