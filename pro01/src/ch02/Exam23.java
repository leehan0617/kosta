package ch02;

import java.io.IOException;

public class Exam23 {
	public static void main(String[] args) throws IOException {
		char ch1,ch2;
		
		do{
			System.out.println("Hello Java");
			System.out.print("���(y/n)?");
			
			ch1=(char)System.in.read();
			System.in.read();
			System.in.read();
		}while(ch1=='Y' || ch1=='y');
		
		System.out.println("End");
		
		while(true){
			System.out.println("HELLO JAVA");
			System.out.print("���(y/n)?");
			
			ch2=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			if(ch2 !='y') break;
		}
		
		System.out.println("End");
	}

}
