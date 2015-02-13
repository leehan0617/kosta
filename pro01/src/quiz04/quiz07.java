package quiz04;

import java.io.IOException;
import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) throws IOException {
		int input1,input2;
		char ch;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요:");
		input1 = scan.nextInt();
		System.out.print("부호를 입력하세요 (+,-,*,/):");
		ch=(char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("수를 입력하세요:");
		input2 = scan.nextInt();
		selectCal(ch,input1,input2);
		scan.close();
	}
	public static void selectCal(char ch,int input1,int input2){
		switch(ch){
		case '+':
			plus(input1,input2);
			break;
		case '-':
			minus(input1,input2);
			break;
		case '*':
			mul(input1,input2);
			break;
		case '/':
			div(input1,input2);
			break;
		default:
			System.out.println("부호 오류");	
		}
	}
	
	public static void plus(int input1,int input2){
		System.out.println(input1+"+"+input2+"="+(input1+input2));
	}
	public static void minus(int input1,int input2){
		System.out.println(input1+"-"+input2+"="+(input1-input2));
	}
	public static void mul(int input1,int input2){
		System.out.println(input1+"*"+input2+"="+(input1*input2));
	}
	public static void div(int input1,int input2){
		float result;
		result=(float)input1/input2;
		System.out.println(input1+"/"+input2+"="+result);
	}
	

}
