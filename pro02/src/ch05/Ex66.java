package ch05;

class AA{
	public void disp(){
		System.out.println(Ex66.z);
	}
}

public class Ex66 {
	public int x=0;
	public String y="hi";
	public static int z=30;
	
	public static void main(String[] args) {
		//System.out.println(x); error
		//System.out.println(y); error
		System.out.println(z);
		
		//aa() error
		bb();
	}
	
	public void aa(){}
	
	public static void bb(){}
	
	public void cc(){}
}
