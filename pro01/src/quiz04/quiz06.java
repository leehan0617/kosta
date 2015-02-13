package quiz04;

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		print();
		a=scan.nextInt();
		print();
		b=scan.nextInt();
		notSwap(a,b);
		swap(a,b);
		scan.close();
	}
	public static void print(){
		System.out.print("수를 입력하세요:");
	}
	
	public static void notSwap(int a,int b){
		System.out.println("현재값:a:"+a+"b:"+b);
	}
	
	public static void swap(int a,int b){
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println("현재값:a:"+a+"b:"+b);
	}

}
