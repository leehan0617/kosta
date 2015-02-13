package ch04;

public class Ex37 {
	public static void main(String[] args) {
		//call by value
		sub1(10 /*매개상수*/);
		System.out.println("hahaha");
		sub2(2);
		System.out.println("hohoho");
		sub2(3);
	}
	
	public static void sub1(int x /*매개변수*/){ // x=10
		System.out.println("x:"+x);
	}
	
	public static void sub2(int y){
		for(int i=0;i<y;i++){
			System.out.println("hahaha");
		}
	}

}
