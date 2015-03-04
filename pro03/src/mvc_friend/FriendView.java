package mvc_friend;
//View
import java.util.Scanner;

public class FriendView {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FriendManager fm=new FriendManager();
		
		while(true){
			fm.menu();
			System.out.print("�����ϼ���:");
			int choice=scan.nextInt();
			
			switch(choice){
			case 1:
				// ģ�� ���
				fm.insert();
				break;
			case 2:
				// ģ�� �˻�
				fm.search();
				break;
			case 3:
				// ģ�� ����
				fm.update();
				break;
			case 4:
				// ģ�� ����
				fm.delete();
				break;
			case 5:
				// ��ü ����
				FriendManager.titleDisp();
				fm.disp();
				break;
			case 6:
				// ����
				System.out.println("���� �Ǿ����ϴ�.");
				if(scan !=null) scan.close();
				return;
			default:
				System.out.println("�߸� �����Ͽ����ϴ�.");
			} //end of switch
		} //end of while
	} //end of Main
}
