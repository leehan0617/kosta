package ch08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam86 {
	public static void main(String[] args) {
		Scanner sc1=null;
		Scanner sc2=null;
		
		try{
			sc1=new Scanner(args[0]);
			int a=sc1.nextInt();
	
			sc2=new Scanner(args[1]);
			int b=sc2.nextInt();
			
			int c=a/b;
			System.out.println("c:" + c);
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �����ϴ�.");
		}catch(InputMismatchException e){
			System.out.println("������ �Է�");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�� ����");
		}finally{
			System.out.println("hahaha");
		}
		
		sc1.close();
		sc2.close();
	}
}
