package quiz06;

import java.util.Scanner;

public class CheckingAccount extends Account{
	private Scanner scan;
	
	public CheckingAccount(){
		scan=new Scanner(System.in);
		System.out.print("���¹�ȣ �Է�:");
		super.number=scan.nextInt();
		System.out.print("�̸��Է�:");
		super.name=scan.next();
		System.out.print("���°����Աݾ�:");
		super.balance=scan.nextInt();
	}
	
	public void withdraw(int money){
		balance-=money;
	}
	
	public void showBalance(){
		System.out.println("�����ܾ�"+super.balance);
	}
	
	public void doSelect(){
		scan=new Scanner(System.in);
		int selectNum;
		int money;
		
		do{
			System.out.print("���ϴ� ��ȣ�� ��������(1.�Ա�,2���,3����)");
			selectNum=scan.nextInt();
			
			if(selectNum==1){
				System.out.print("�Աݾ�:");
				money=scan.nextInt();
				balance+=money;
				showBalance();
			}else if(selectNum==2){
				System.out.print("��ݾ�:");
				money=scan.nextInt();
				balance-=money;
				if(balance<-50000){
					System.out.println("��� ����! ���̳ʽ��ݾ��� �ʰ��Ͽ����ϴ�.");
					balance+=money;
				}
				showBalance();
			}
		}while(selectNum!=3);
	}
}
