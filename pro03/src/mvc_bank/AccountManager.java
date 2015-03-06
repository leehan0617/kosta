package mvc_bank;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;
	private Scanner scan;
	
	public AccountManager(){
		list=new ArrayList<Account>();
		scan=new Scanner(System.in);
	}
	
	public void printMenu(){
		System.out.println("==================Menu==================");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.잔액조회");
		System.out.println("5.전체출력");
		System.out.println("6.종료");
		System.out.println("========================================");
	}
	
	public void makeAccount(){
		Account account=new Account();
		
		System.out.print("계좌번호:");
		account.setId(scan.nextInt());
		
		System.out.print("이름:");
		account.setName(scan.next());
		
		System.out.print("입금액:");
		account.setBalance(scan.nextLong());
		
		list.add(account);
		System.out.print("계좌가 개설되었습니다.");
	}
	
	public void deposit(){
		System.out.print("계좌번호:");
		int id=scan.nextInt();
		
		System.out.print("입금액:");
		long money=scan.nextInt();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				long balance=account.getBalance()+money;
				account.setBalance(balance);
				System.out.println("입금완료 되었습니다.");
				return ;
			}
		}
		
		System.out.println("유효하지 않는 계좌번호 입니다.");
	}
	
	public void disp(){
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			System.out.println(account.getId()+"\t"+account.getName()+"\t"+account.getBalance());
		}
	}
	
	public void withdraw(){
		System.out.print("계좌번호:");
		int id=scan.nextInt();
		
		System.out.print("출금액:");
		long money=scan.nextLong();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				if(account.getBalance()>=money){
				money=account.getBalance()-money;
				account.setBalance(money);
				System.out.println("출금이 완료되었습니다.");
				return ;
				}
			}
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void showMoney(){
		System.out.print("계좌번호:");
		int id=scan.nextInt();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				System.out.println("현재잔액은:"+account.getBalance()+"입니다.");
				return ;
			}
		}
		System.out.println("유효하지 않는 계좌번호입니다.");
	}
}
