package quiz02;

import java.io.IOException;
import java.util.Scanner;

/*
 * ������ ��Ģ���� ���α׷��̴�.�Ʒ��� ���ȭ�� ���� ���α׷��� �ۼ��ϼ���.
[���ȭ��]
���� �Է��ϼ���:10
��ȣ�� �Է��ϼ���(+, -, *, /) :+
���� �Է��ϼ���:20
10+20=30
���� �Է��ϼ���:10
��ȣ�� �Է��ϼ���(+, -, *, /) :&
���� �Է��ϼ���:20
���� �Է��ϼ���:10
��ȣ�� �Է��ϼ���(+, -, *, /) :-
���� �Է��ϼ���:20
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
			System.out.print("���� �Է��ϼ���:");
			input1 = scan.nextInt();
			System.out.print("��ȣ�� �Է��ϼ���(+,-,*,/):");
			ch=(char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.print("���� �Է��ϼ���:");
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