package quiz02;

import java.util.Scanner;

/*
 * � ���� �Է��ؼ� �� ���� 10���� ũ�� 20���� ������ ����ϴ�
 * ���α׷��� �ۼ��ϼ���. 
 */
public class quiz2 {
	public static void main(String[] args) {
		int input; //���
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input number:");
		input = scan.nextInt();
		
		if(input>10 && input<20){
			System.out.println(input);
		}else{
			System.out.println("10���� ũ�� 20���� �������� �Է��ϼ���.");
		}
		
		scan.close();
	}

}
