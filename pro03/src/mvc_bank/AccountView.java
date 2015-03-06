package mvc_bank;

import java.util.Scanner;

public class AccountView {
	public static void main(String[] args) {
		AccountManager jbank=new AccountManager();
		Scanner scan=new Scanner(System.in);
		
		while(true){
			jbank.printMenu();
			System.out.print("����:");
			int choice=scan.nextInt();
			switch(choice){
				case 1:
					jbank.makeAccount();
					//���°���
					break;
				case 2:
					jbank.deposit();
					//�Ա�
					break;
				case 3:
					jbank.withdraw();
					//���
					break;
				case 4:
					jbank.showMoney();
					//�ܾ���ȸ
					break;
				case 5:
					jbank.disp();
					//��ü���
					break;
				case 6:
					System.out.println("�����մϴ�.");
					if(scan!=null) scan.close();
					return;
				default:
					System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		}
	}
}
