package ch02;

import java.io.IOException;

public class Exam21 {
	public static void main(String[] args) throws IOException{
		System.out.print("input char");
		char a=(char)System.in.read(); // 65 A
		System.out.println(a);
		System.in.read();       //enter \r\n 
		System.in.read();
		
		System.out.print("input char");
		char b=(char)System.in.read();
		System.out.println(b);
		System.in.read();
		System.in.read();
		
		System.out.print("input char");
		char c=(char)System.in.read();
		System.out.println(c);
		System.in.read();
		System.in.read();
		
	}

}
