package quiz02;

/*
 * 버스요금이 어른 300원 청년이 200원 어린이가 100원이라고 할 때,
 * 입력한 인원 전체의 버스 요금을 화면상에 표시하는 프로그램을 작성하세요.
 * (단,어른이 5명 이상 이면 어린이는 50원이다.)
 */
import java.util.Scanner;

public class quiz4 {
	public static void main(String[] args) {
		int adult,student,child;
		int price;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("어른의 수를 입력하세요:");
		adult = scan.nextInt();
		System.out.print("청년의 수를 입력하세요:");
		student = scan.nextInt();
		System.out.print("어린이의 수를 입력하세요:");
		child = scan.nextInt();
		
		if(adult < 5){
			price = adult*300 + student*200 + child*100;
		}else{
			price = adult*300 + student*200 + child*50;
		}
		System.out.println("총요금:"+price);
		scan.close();
	}

}
