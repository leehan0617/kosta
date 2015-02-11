package ch02;

import java.io.IOException;
import java.util.Scanner;

public class Exam22 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input String:");
		String str="";
		str=scan.next();
		System.out.println("str:"+str);
		
		System.out.print("input number:");
		int x=0;
		x=scan.nextInt();
		System.out.println("x:"+x);
		
		System.out.print("input character:");
		char y=' ';
		y=(char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("y:"+y);
		
		
		scan.close();
	}

}
