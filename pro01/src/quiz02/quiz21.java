package quiz02;

import java.util.Scanner;

/*
 * 연도를 입력받아 윤년인지 아닌지를 구별하는 프로그램을 작성해 보자.
    윤년은 일반적으로 4년에 한번씩 돌아오는데 그 중 100으로 나누어 떨어지는 해는
    윤년이 아니다. 그러나 100으로 나누어 떨어지는 해 중 400으로 나누어 떨어지는
    해는 윤년이다

 */
public class quiz21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.print("연도를 입력하세요:");
		year = scan.nextInt();
		
		
		if((year%4 ==0 && year%100 != 0) || (year%100==0 && year%400==0)){
			System.out.println("윤년입니다.");
		}else{
			System.out.println("윤년이 아닙니다.");
		}
		
		scan.close();
	}

}
