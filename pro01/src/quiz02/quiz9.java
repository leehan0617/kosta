package quiz02;

import java.util.Scanner;

/*
 * Ű����κ��� ����3���� �Է¹޾Ƽ� a, b, c �� ������ �� ���� ū ���� ����ϼ���.
 */
public class quiz9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		int temp1,temp2,result;
		
		System.out.print("input a:");
		a=scan.nextInt();
		System.out.print("input b:");
		b=scan.nextInt();
		System.out.print("input c:");
		c=scan.nextInt();
		temp1 = a;
		
		if(b>c) temp2 = b;
		else temp2 = c;
		
		if(temp1>temp2) result = temp1;
		else result = temp2;
		
		
		System.out.println("Max number:"+result);
		scan.close();
	}

}