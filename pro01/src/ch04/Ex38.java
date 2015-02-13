package ch04;

public class Ex38 {
	public static void main(String[] args) {
		sub(2,5);
		System.out.println("hahaha");
		
		sub(3,3);
		System.out.println("hohoho");
		
		sub(2,10);
		System.out.println("end");
	}
	
	public static void sub(int a,int b){
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
