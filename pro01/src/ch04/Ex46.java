package ch04;

import java.util.Scanner;

public class Ex46 {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.print("args["+i+"]:"+args[i]+"\t");	
		}
		System.out.println();
		
		Scanner scan=null;
		for(int i=0;i<args.length;i++){
			scan=new Scanner(args[i]);
			int value=scan.nextInt();
			System.out.print(++value+"\t");
		}		
		
		scan.close();
	}

}
