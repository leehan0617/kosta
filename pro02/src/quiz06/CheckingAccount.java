package quiz06;

import java.util.Scanner;

public class CheckingAccount extends Account{
	private Scanner scan;
	
	public CheckingAccount(){
		scan=new Scanner(System.in);
		System.out.print("계좌번호 입력:");
		super.number=scan.nextInt();
		System.out.print("이름입력:");
		super.name=scan.next();
		System.out.print("계좌개설입금액:");
		super.balance=scan.nextInt();
	}
	
	public void withdraw(int money){
		balance-=money;
	}
	
	public void showBalance(){
		System.out.println("현재잔액"+super.balance);
	}
	
	public void doSelect(){
		scan=new Scanner(System.in);
		int selectNum;
		int money;
		
		do{
			System.out.print("원하는 번호를 누르세요(1.입금,2출금,3종료)");
			selectNum=scan.nextInt();
			
			if(selectNum==1){
				System.out.print("입금액:");
				money=scan.nextInt();
				balance+=money;
				showBalance();
			}else if(selectNum==2){
				System.out.print("출금액:");
				money=scan.nextInt();
				balance-=money;
				if(balance<-50000){
					System.out.println("출금 실패! 마이너스금액을 초과하였습니다.");
					balance+=money;
				}
				showBalance();
			}
		}while(selectNum!=3);
	}
}
