package quiz08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) throws IOException {
		ArrayList<Character> list=new ArrayList<Character>();
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print((i+1)+"번째학점을 입력하세요:");
			char grade=(char)System.in.read();
			System.in.read();
			System.in.read();
			list.add(grade);
		}
		scan.close();
		
		for(int i=0;i<list.size();i++){
			System.out.print((i+1)+"번째 학점:");
			switch(list.get(i)){
				case 'A':
					System.out.println("A=4.0");
					break;
				case 'B':
					System.out.println("B=3.0");
					break;
				case 'C':
					System.out.println("C=2.0");
					break;
				case 'D':
					System.out.println("D=1.0");
					break;
				case 'F':
					System.out.println("F=0");
					break;
			}
		}
	}
}
