package ch03;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] array=new int[2][3];
		
		for(int i=0;i<array.length;i++){          //0 , 1
			for(int j=0;j<array[i].length;j++){   //012, 012
				System.out.print("수를 입력:");
				array[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
