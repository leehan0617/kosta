package quiz02;

import java.io.IOException;

public class Quiz06 {
	public static void main(String[] args) throws IOException{		
		System.out.print("���ڸ� �Է��ϼ���:");
		char ch=(char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(ch=='m' || ch=='M'){
			System.out.println("man");
		}else if(ch=='w' || ch=='W'){
			System.out.println("woman");
		}else{
			System.out.println("???");
		}
	}
}
