package mvc_friend;
//View
import java.util.Scanner;

public class FriendView {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FriendManager fm=new FriendManager();
		
		while(true){
			fm.menu();
			System.out.print("선택하세요:");
			int choice=scan.nextInt();
			
			switch(choice){
			case 1:
				// 친구 등록
				fm.insert();
				break;
			case 2:
				// 친구 검색
				fm.search();
				break;
			case 3:
				// 친구 수정
				fm.update();
				break;
			case 4:
				// 친구 삭제
				fm.delete();
				break;
			case 5:
				// 전체 보기
				FriendManager.titleDisp();
				fm.disp();
				break;
			case 6:
				// 종료
				System.out.println("종료 되었습니다.");
				if(scan !=null) scan.close();
				return;
			default:
				System.out.println("잘못 선택하였습니다.");
			} //end of switch
		} //end of while
	} //end of Main
}
