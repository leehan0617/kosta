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
				jbank.makeAccount();		//���� ����
				break;
			case 2:
				jbank.inMoney();           // �Ա�
				System.out.println("�Ա� �Ϸ�");
				break;
			case 3:
				jbank.outMoney();          //���
				break;
			case 4:
				jbank.showSingleBalance();  //���� ���� �ܾ� ��ȸ
				break;
			case 5:
				jbank.showAllBalance();     //��ü ���� �ܾ� ��ȸ
				break;
			case 6:
				jbank.showAllAccount();		//��ü ���� ���� ��ȸ
				break;
			case 7:
				System.out.println("�����մϴ�.");
				if(sc!=null)sc.close();
				System.exit(0);
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
}
