package testLib;

public class Test {
	private int x;
	private int y;
	private int z;
	
	public Test(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void yonsan(){
		z=x+y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y + "\t" + z);
	}
}
