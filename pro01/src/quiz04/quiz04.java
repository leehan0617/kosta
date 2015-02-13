package quiz04;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		print();
		drawStar(calStar());
	}
	
	private static void print(){
		System.out.print("별수를 입력하세요:");
	}
	private static int calStar(){
		int star;
		Scanner scan =new Scanner(System.in);
		star=scan.nextInt();
		scan.close();
		return star;
	}
	private static void drawStar(int star){
		for(int i=0;i<star;i++){
			System.out.print("*");
		}
		System.out.println();
	}

}
