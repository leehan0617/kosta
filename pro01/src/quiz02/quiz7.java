package quiz02;

import java.util.Scanner;

/*
 * �� ������ �Է� �޾� 10������ ������ ���Ͽ�
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class quiz7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input1,input2,input3;
		int sum=0;
		
		System.out.print("input number1:");
		input1 = scan.nextInt();
		System.out.print("input number2:");
		input2 = scan.nextInt();
		System.out.print("input number3");
		input3 = scan.nextInt();
		
		if(input1<=10){
			sum = sum+input1;
		}
		if(input2<=10){
			sum = sum+input2;
		}
		if(input3<=10){
			sum = sum+input3;
		}
		
		System.out.println("sum:"+sum);
		scan.close();
		
	}

}