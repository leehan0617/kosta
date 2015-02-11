package quiz02;

import java.util.Scanner;

/*
 * 어떤 수를 입력해서 그 수가 10보다 크고 20보다 작으면 출력하는
 * 프로그램을 작성하세요. 
 */
public class quiz2 {
	public static void main(String[] args) {
		int input; //어떤수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input number:");
		input = scan.nextInt();
		
		if(input>10 && input<20){
			System.out.println(input);
		}else{
			System.out.println("10보다 크고 20보다 작은수를 입력하세요.");
		}
		
		scan.close();
	}

}
