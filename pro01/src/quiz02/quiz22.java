package quiz02;

import java.io.IOException;
import java.util.Scanner;

/*
 * 다음은 사칙연산 프로그램이다.아래의 출력화면 보고 프로그램을 작성하세요.
[출력화면]
수를 입력하세요:10
부호를 입력하세요(+, -, *, /) :+
수를 입력하세요:20
10+20=30
수를 입력하세요:10
부호를 입력하세요(+, -, *, /) :&
수를 입력하세요:20
수를 입력하세요:10
부호를 입력하세요(+, -, *, /) :-
수를 입력하세요:20
10-20=-10

 */
public class quiz22 {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		int input1,input2;
		char ch=' ';
		int result=0;
		float divResult=0;
		
		while(ch!='+'&&ch!='-'&&ch!='*'&&ch!='/'){
			System.out.print("수를 입력하세요:");
			input1 = scan.nextInt();
			System.out.print("부호를 입력하세요(+,-,*,/):");
			ch=(char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.print("수를 입력하세요:");
			input2 = scan.nextInt();
			
			if(ch=='+'){
				result=input1+input2;
				System.out.println(input1+"+"+input2+"="+result);
			}else if(ch=='-'){
				result=input1-input2;
				System.out.println(input1+"-"+input2+"="+result);
			}else if(ch=='*'){
				result=input1*input2;
				System.out.println(input1+"*"+input2+"="+result);
			}else if(ch=='/'){
				divResult=(float)input1/input2;
				System.out.println(input1+"/"+input2+"="+divResult);
			}
		}
		scan.close();
	}
}
