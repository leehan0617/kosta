package quiz02;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {			
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�Ⱓ�� �Է�:");
		int year=sc.nextInt();
		
		System.out.print("������Է�:");
		long money=sc.nextLong();
		
		int result=0;
		if(year==7){
			result=(int) (money*0.0725)/12;
		}else if(year==15){
			result=(int) (money*0.085)/12;
		}else if(year==30){
			result=(int) (money*0.09)/12;
		}
		
		System.out.println("�����:" + money + "\t" + "������:" + result);
		sc.close();
	}
}
