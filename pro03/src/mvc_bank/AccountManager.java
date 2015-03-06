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
		System.out.println("1.���°���");
		System.out.println("2.�Ա�");
		System.out.println("3.���");
		System.out.println("4.�ܾ���ȸ");
		System.out.println("5.��ü���");
		System.out.println("6.����");
		System.out.println("========================================");
	}
	
	public void makeAccount(){
		Account account=new Account();
		
		System.out.print("���¹�ȣ:");
		account.setId(scan.nextInt());
		
		System.out.print("�̸�:");
		account.setName(scan.next());
		
		System.out.print("�Աݾ�:");
		account.setBalance(scan.nextLong());
		
		list.add(account);
		System.out.print("���°� �����Ǿ����ϴ�.");
	}
	
	public void deposit(){
		System.out.print("���¹�ȣ:");
		int id=scan.nextInt();
		
		System.out.print("�Աݾ�:");
		long money=scan.nextInt();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				long balance=account.getBalance()+money;
				account.setBalance(balance);
				System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
				return ;
			}
		}
		
		System.out.println("��ȿ���� �ʴ� ���¹�ȣ �Դϴ�.");
	}
	
	public void disp(){
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			System.out.println(account.getId()+"\t"+account.getName()+"\t"+account.getBalance());
		}
	}
	
	public void withdraw(){
		System.out.print("���¹�ȣ:");
		int id=scan.nextInt();
		
		System.out.print("��ݾ�:");
		long money=scan.nextLong();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				if(account.getBalance()>=money){
				money=account.getBalance()-money;
				account.setBalance(money);
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				return ;
				}
			}
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	public void showMoney(){
		System.out.print("���¹�ȣ:");
		int id=scan.nextInt();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				System.out.println("�����ܾ���:"+account.getBalance()+"�Դϴ�.");
				return ;
			}
		}
		System.out.println("��ȿ���� �ʴ� ���¹�ȣ�Դϴ�.");
	}
}
