package quiz02;

import java.util.Scanner;

/*
 * 두 개의 수를 입력 받아서 그 중 큰 수를 출력하는 프로그램을 작성하세요.
 */
public class quiz3 {
	public static void main(String[] args) {
		int input1,input2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input number1:");
		input1 = scan.nextInt();
		System.out.print("input number2:");
		input2 = scan.nextInt();
		
		if(input1 > input2){
			System.out.println(input1);
		}else if(input1 < input2){
			System.out.println(input2);
		}else{
			System.out.println("같은수입니다.");
		}
		scan.close();
	}

}
