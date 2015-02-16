package ch04;

public class Ex50 {
	public static int count=0;
	
	public static void main(String[] args) {
		sub(10);
		sub(20);
		sub(30);
	}
	
	public static void sub(int x){
		System.out.println("x:" + x);
		System.out.println("count:" + ++count);
	}

}
