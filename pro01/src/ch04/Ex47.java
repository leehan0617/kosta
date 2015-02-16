package ch04;

public class Ex47 {
	public static void main(String[] args) {
		disp("±æµ¿");
		disp(10);
		disp(24.5f);
		disp(10,40);
		disp('A');
	}
	/**********************Over Loading*********************************/
	public static void disp(String str){
		System.out.println(str);
	}
	
	public static void disp(int a){
		System.out.println(a);
	}
	
	public static void disp(float f){
		System.out.println(f);
	}
	
	public static void disp(int a,int b){
		System.out.println(a+","+b);
	}
	
	public static void disp(char ch){
		System.out.println(ch);
	}

}
