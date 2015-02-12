package ch03;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("배열수를 입력하세요:");
		int su=scan.nextInt();
		
		int[] array=new int[su];
		for(int i=0;i<array.length;i++){
			System.out.print("수를 입력하세요:");
			array[i]=scan.nextInt();
		}
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		scan.close();
		
	}

}
