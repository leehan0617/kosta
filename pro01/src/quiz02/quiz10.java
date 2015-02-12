package quiz02;

import java.util.Scanner;

/*
 * 대출금 월이자 계산 하는 프로그램을 작성하시오.연리가 기간에 따라 다르다고 가정 한다면,
	7년 7.25%, 15년 8.5%, 30년 9.0%이다. (소수이하는 처리하지 않는다.)
  	[출력화면]	
	기간을 입력:7
	대출금입력:100000
	대출금:100000	월이자:604
*/
public class quiz10 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int year;
		int money;
		int interest=0;
		
		System.out.print("기간을 입력:");
		year = scan.nextInt();
		System.out.print("대출금입력:");
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
		
		System.out.println("대출금:"+money+"이자:"+interest);
		scan.close();
	}

}
