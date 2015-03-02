package quiz07;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input1,input2;
		System.out.print("수를 입력하세요:");
		input1=scan.next();
		System.out.print("수를 입력하세요:");
		input2=scan.next();
		
		Integer number1=new Integer(input1);
		Integer number2=new Integer(input2);
		
		System.out.println("sum:"+ (number1+number2));
		scan.close();
	}
}
