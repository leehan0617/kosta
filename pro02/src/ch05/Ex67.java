package ch05;

class TestF{
	private final double pi=3.141592;
	private static final int su=10;
	
	public double getPi(){
		return pi;
	}
	
	public void sub(){
		System.out.println(pi + "\t" + su);
	}
	
	public static void disp(){
		System.out.println(su);
		//System.out.println(pi); error
	}
	
//	public void setPi(double pi){
//		this.pi=pi;
//	}
}

public class Ex67 {
	public static void main(String[] args) {
		
	}
}
