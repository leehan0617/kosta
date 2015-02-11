package quiz02;

import java.io.IOException;

/*
 * 키보드로부터 입력한 문자가 M 또는 m 이면 man ,
 * W또는 w이면 woman
 * 그 외 이면 ???을 화면상에 표시하는 프로그램을 작성하세요.
 */
public class quiz6 {
	public static void main(String[] args) throws IOException{
		char input =' ';
		
		System.out.print("input character:");
		input = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(input =='m' || input =='M'){
			System.out.println("Man");
		}else if(input =='w' || input=='W'){
			System.out.println("Woman");
		}else{
			System.out.println("???");
		}
	}

}
