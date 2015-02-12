package quiz02;

import java.io.IOException;

public class Quiz08 {
	public static void main(String[] args) throws IOException{
		
		System.out.print("영문대,소문자 하나만 입력하세요.");
		char ch=(char) System.in.read();
		System.in.read();
		System.in.read();
		
		if(ch >= 'A' && ch <='Z'){
			System.out.println("대문자 소문자변환:" + (ch+=32));
		}else if(ch >='a' && ch <='z'){
			System.out.println("소문자 대문자변환:" + (ch-=32));
		}
	}
}
