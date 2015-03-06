package mvc_bank;

import java.util.Scanner;

public class AccountView {
	public static void main(String[] args) {
		AccountManager jbank=new AccountManager();
		Scanner scan=new Scanner(System.in);
		
		while(true){
			jbank.printMenu();
			System.out.print("선택:");
			int choice=scan.nextInt();
			switch(choice){
				case 1:
					jbank.makeAccount();
					//계좌개설
					break;
				case 2:
					jbank.deposit();
					//입금
					break;
				case 3:
					jbank.withdraw();
					//출금
					break;
				case 4:
					jbank.showMoney();
					//잔액조회
					break;
				case 5:
					jbank.disp();
					//전체출력
					break;
				case 6:
					System.out.println("종료합니다.");
					if(scan!=null) scan.close();
					return;
				default:
					System.out.println("잘못입력하였습니다.");
			}
		}
	}
}
