package quiz02;

import java.util.Scanner;

/*
 * ����� ������ ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.������ �Ⱓ�� ���� �ٸ��ٰ� ���� �Ѵٸ�,
	7�� 7.25%, 15�� 8.5%, 30�� 9.0%�̴�. (�Ҽ����ϴ� ó������ �ʴ´�.)
  	[���ȭ��]	
	�Ⱓ�� �Է�:7
	������Է�:100000
	�����:100000	������:604
*/
public class quiz10 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int year;
		int money;
		int interest=0;
		
		System.out.print("�Ⱓ�� �Է�:");
		year = scan.nextInt();
		System.out.print("������Է�:");
		money = scan.nextInt();
		
		switch(year){
		case 7:
			interest = (int) ((int)money*0.0725/12);
			break;
		case 15:
			interest = (int) ((int)money*0.085/12);
			break;
		case 30:
			interest = (int) ((int)money*0.09/12);
			break;
		default:
			System.out.println("Error");
		}
		
		System.out.println("�����:"+money+"����:"+interest);
		scan.close();
	}

}