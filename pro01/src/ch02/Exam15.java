package ch02;

public class Exam15 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("How are you");
		}
		System.out.println("hahaha");
		
		for (int j = 0; j <= 10; j+=2) {
			System.out.println(j);
		}
		for (int k = 1; k <= 100; k++) {
			System.out.print(k+"\t");
			if(k%10==0)	System.out.println();
		}
	}

}
