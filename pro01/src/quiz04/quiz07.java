package quiz04;

import java.io.IOException;
import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) throws IOException {
		test t = new test();
		
		print(1);
		t.input1 = returnInput();
		print(2);
		t.ch=returnCh();
		print(1);
		t.input2 = returnInput();
		selectCal(t.ch,t.input1,t.input2);
	}
	public static int returnInput(){
		int input=0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		input=scan.nextInt();
		return input;
	}
	public static char returnCh() throws IOException{
		char ch;
		ch=(char)System.in.read();
		System.in.read();
		System.in.read();
		return ch;
	}
	public static void print(int num){
		if(num==1){
		System.out.print("수를 입력하세요:");
		}else if(num==2){
		System.out.print("부호를 입력하세요 (+,-,*,/):");
		}
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
