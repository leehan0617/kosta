package quiz02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���:");
		int first=sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���:");
		int second=sc.nextInt();
		
		if(first > second){
			System.out.println("first=" + first);
		}else {
			System.out.println("second=" + second);
		}
		
		sc.close();
	}
}
