package quiz07;


import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���:");
		String su=sc.next();
		
		System.out.print("���� �Է��ϼ���:");
		String value=sc.next();
		
		System.out.println("sum:" + (Integer.parseInt(su) + Integer.parseInt(value)));
		
		sc.close();
	}
}
