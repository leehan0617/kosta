package quiz02;

import java.util.Scanner;

/*
 * 몸무게와 키를 입력 받아 그 사람이 다이어트가 필요한지를
 * 결정하는 프로그램을 작성하세요.
 * (단 몸무게>(키-100)0.9이면 다이어트가 필요한 것으로 한다.)
 */
public class quiz5 {
	public static void main(String[] args) {
		double weight,height; //weight:몸무게 , height:키
		double result; // 비만도 결정치
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input weight:");
		weight=scan.nextDouble();
		System.out.print("input height");
		height=scan.nextDouble();
		
		result = (height-100)*0.9;
		
		if(weight>result){
			System.out.println("다이어트가 필요합니다.");
		}else{
			System.out.println("정상입니다.");
		}
		scan.close();
		
	}
}
