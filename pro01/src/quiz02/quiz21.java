package quiz02;

import java.util.Scanner;

/*
 * ������ �Է¹޾� �������� �ƴ����� �����ϴ� ���α׷��� �ۼ��� ����.
    ������ �Ϲ������� 4�⿡ �ѹ��� ���ƿ��µ� �� �� 100���� ������ �������� �ش�
    ������ �ƴϴ�. �׷��� 100���� ������ �������� �� �� 400���� ������ ��������
    �ش� �����̴�

 */
public class quiz21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.print("������ �Է��ϼ���:");
		year = scan.nextInt();
		
		
		if((year%4 ==0 && year%100 != 0) || (year%100==0 && year%400==0)){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("������ �ƴմϴ�.");
		}
		
		scan.close();
	}

}