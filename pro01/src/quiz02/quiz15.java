package quiz02;

import java.util.Scanner;

/*
 * 	������ ������ �Է� �޾Ƽ� ���հ� ����� ���ϼ���.
	[���ȭ��]
	��� ���� �Է¹ްڽ��ϱ�?3
	���� �Է��ϼ���:1
	���� �Է��ϼ���:2
	���� �Է��ϼ���:3
	sum:6	avg:2.0
*/
public class quiz15 {
	public static void main(String[] args) {
		int input,number;
		int sum=0;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ���� �Է¹ްڽ��ϱ�?");
		input = scan.nextInt();
		for(int i=1;i<=input;i++){
			System.out.print("���� �Է��ϼ���:");
			number = scan.nextInt();
			sum += number;
		}
		avg = sum/input;
		System.out.println("sum:"+sum+"avg:"+avg);
		scan.close();
	}

}