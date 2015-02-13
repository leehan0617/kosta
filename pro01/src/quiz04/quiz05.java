package quiz04;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		int input1,input2;
		Scanner scan = new Scanner(System.in);
		print();
		input1=scan.nextInt();
		print();
		input2=scan.nextInt();
		findMax(input1,input2);
		scan.close();
	}
	public static void print(){
		System.out.print("수를 입력하세요:");
	}
	public static void findMax(int input1,int input2){
		if(input1>input2){
			System.out.println(input1+"이 큽니다.");
		}else if(input1<input2){
			System.out.println(input2+"이 큽니다.");
		}else{
			System.out.println("같습니다.");
		}
	}

}
