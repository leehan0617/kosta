package quiz10;

import java.util.ArrayList;
import java.util.Scanner;


public class Quiz04 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> array=new ArrayList<Character>();
		
		for(int i=0;i<5;i++){
			System.out.print((i+1)+"번째 학점 입력:");
			char ch=sc.next().charAt(0);
			array.add(ch);
		}
		System.out.println();
		
		for(int i=0;i<array.size();i++){
			char grade=array.get(i);
			System.out.print((i+1) + "번째 학점:");
			switch(grade){
			case 'A':System.out.println("A=4.0");break;
			case 'B':System.out.println("B=3.0");break;
			case 'C':System.out.println("C=2.0");break;
			case 'D':System.out.println("D=1.0");break;
			case 'F':System.out.println("F=0");break;
			default:System.out.println("학점을 잘못 입력하셨습니다.");
			}
		}
		sc.close();
	}
}
