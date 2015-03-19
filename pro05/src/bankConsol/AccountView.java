package bankConsol;

import java.util.Scanner;
import dbUnit.*;

public class AccountView {
	public static void main(String[] args) {
		DriverProvider.getDriver();
		AccountDao jbank=new AccountDao();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			jbank.printMenu();
			int choice=sc.nextInt();
			
			switch(choice){
			case 1:
				jbank.makeAccount();		//계좌 생성
				break;
			case 2:
				jbank.inMoney();           // 입금
				System.out.println("입금 완료");
				break;
			case 3:
				jbank.outMoney();          //출금
				break;
			case 4:
				jbank.showSingleBalance();  //개인 계좌 잔액 조회
				break;
			case 5:
				jbank.showAllBalance();     //전체 계좌 잔액 조회
				break;
			case 6:
				jbank.showAllAccount();		//전체 계좌 정보 조회
				break;
			case 7:
				System.out.println("종료합니다.");
				if(sc!=null)sc.close();
				System.exit(0);
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
