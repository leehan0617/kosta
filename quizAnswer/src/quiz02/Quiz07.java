package quiz02;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		int a=sc.nextInt();
		
		System.out.print("���� �Է��ϼ���:");
		int b=sc.nextInt();
		
		System.out.print("���� �Է��ϼ���:");
		int c=sc.nextInt();
		
		int sum=0;
		
		if(a < 10)
			sum+=a;
		
		if(b < 10)
			sum+=b;
		
		if(c <10)
			sum+=c;
		
		System.out.println("sum:" + sum);
		sc.close();
	}
}
