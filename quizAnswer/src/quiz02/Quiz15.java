package quiz02;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("��� ���� �Է¹ްڽ��ϱ�?");
		int suCount=sc.nextInt();
		
		int sum=0;		
		for(int i=0;i<suCount;i++){
			System.out.print("���� �Է��ϼ���:");
			int su=sc.nextInt();
			sum+=su;
		}
		
		float avg=(float) sum/3;
		System.out.println("sum:" + sum + "\t" + "avg:" + avg);
		
		sc.close();
	}
}
