package quiz02;

import java.util.Scanner;

/*
 * 	임의의 정수를 입력 받아서 총합과 평균을 구하세요.
	[출력화면]
	몇개의 수를 입력받겠습니까?3
	수를 입력하세요:1
	수를 입력하세요:2
	수를 입력하세요:3
	sum:6	avg:2.0
*/
public class quiz15 {
	public static void main(String[] args) {
		int input,number;
		int sum=0;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇개의 수를 입력받겠습니까?");
		input = scan.nextInt();
		for(int i=1;i<=input;i++){
			System.out.print("수를 입력하세요:");
			number = scan.nextInt();
			sum += number;
		}
		avg = sum/input;
		System.out.println("sum:"+sum+"avg:"+avg);
		scan.close();
	}

}
