package quiz02;

import java.util.Scanner;

/*
 * �����Կ� Ű�� �Է� �޾� �� ����� ���̾�Ʈ�� �ʿ�������
 * �����ϴ� ���α׷��� �ۼ��ϼ���.
 * (�� ������>(Ű-100)0.9�̸� ���̾�Ʈ�� �ʿ��� ������ �Ѵ�.)
 */
public class quiz5 {
	public static void main(String[] args) {
		double weight,height; //weight:������ , height:Ű
		double result; // �񸸵� ����ġ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input weight:");
		weight=scan.nextDouble();
		System.out.print("input height");
		height=scan.nextDouble();
		
		result = (height-100)*0.9;
		
		if(weight>result){
			System.out.println("���̾�Ʈ�� �ʿ��մϴ�.");
		}else{
			System.out.println("�����Դϴ�.");
		}
		scan.close();
		
	}
}
