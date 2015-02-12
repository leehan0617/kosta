package ch03;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array=new int[5];
		
		for(int i=0;i<array.length;i++){
			System.out.println("Input:");
			array[i]=scan.nextInt();
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		scan.close();
	}

}
