package quiz02;

import java.io.IOException;

public class Quiz08 {
	public static void main(String[] args) throws IOException{
		
		System.out.print("������,�ҹ��� �ϳ��� �Է��ϼ���.");
		char ch=(char) System.in.read();
		System.in.read();
		System.in.read();
		
		if(ch >= 'A' && ch <='Z'){
			System.out.println("�빮�� �ҹ��ں�ȯ:" + (ch+=32));
		}else if(ch >='a' && ch <='z'){
			System.out.println("�ҹ��� �빮�ں�ȯ:" + (ch-=32));
		}
	}
}
