package ch08;

import java.util.Scanner;

public class Exam89 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=0;
		
		try{
			System.out.print("���� �Է��ϼ���:");
			b=sc.nextInt();
			
			if(b==10){
				NumberFormatException ex=new NumberFormatException();
				throw ex;
			}
			System.out.println("b"+ b);
		}catch(NumberFormatException e){
			System.out.println("10�� �ȵ�");
			e.printStackTrace();
		}finally{
			if(sc!=null) sc.close();
		}
	}
}
