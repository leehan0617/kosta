package ch04;

public class Ex48 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=yonsan(a,b);
		
		float x=33.3f;
		float y=22.2f;
		float z=yonsan(x,y);
		
		System.out.println("int + int :"+c+" float + float :"+z);
	}
	
	public static int yonsan(int a,int b){
		return a+b;
	}
	public static float yonsan(float a,float b){
		return a+b;
	}

}
