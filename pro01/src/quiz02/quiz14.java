package quiz02;

import java.util.Scanner;

/*
 * 10개의 정수를 입력 받아서 양수와 음수의 개수를 구하는 프로그램을 작성하세요. (for문)
  [출력화면]
  수를 입력하세요:1
  수를 입력하세요:2
  수를 입력하세요:-3
  수를 입력하세요:-4
  수를 입력하세요:-5
  수를 입력하세요:6
  수를 입력하세요:7
  수를 입력하세요:8
  수를 입력하세요:9
  수를 입력하세요:-10
  양수개수:6
  음수개수:4
*/
public class quiz14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int plusNum=0,minusNum=0;
		int input;
		for(int i=1;i<=10;i++){
			System.out.print("수를 입력하세요:");
			input = scan.nextInt();
			if(input >0) plusNum++;
			if(input <0) minusNum++;
		}
		System.out.println("양수개수:"+plusNum);
		System.out.println("음수개수:"+minusNum);
		scan.close();
	}

}
