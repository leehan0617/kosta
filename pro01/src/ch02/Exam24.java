package ch02;

import java.io.IOException;
import java.util.Scanner;

public class Exam24 {
	public static void main(String[] args) throws IOException {
		int dan;
		char loop;
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("단을 입력하세요.");
			dan = scan.nextInt();
			
			for(int i=1;i<10;i++){
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			System.out.println("더할래(y/n)?");
			loop =(char)System.in.read();
			System.in.read();
			System.in.read();
		}while(loop == 'Y' || loop =='y');
		
		System.out.println("End");
		scan.close();
	}

}
