package quiz02;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {			
		Scanner sc=new Scanner(System.in);
		
		System.out.print("기간을 입력:");
		int year=sc.nextInt();
		
		System.out.print("대출금입력:");
		long money=sc.nextLong();
		
		int result=0;
		if(year==7){
			result=(int) (money*0.0725)/12;
		}else if(year==15){
			result=(int) (money*0.085)/12;
		}else if(year==30){
			result=(int) (money*0.09)/12;
		}
		
		System.out.println("대출금:" + money + "\t" + "월이자:" + result);
		sc.close();
	}
}
