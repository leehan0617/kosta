package ch10;

public class AA {
	private int x,y,z;

	public AA(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void yonsan(){
		z=x+y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y + "\t" + z);
	}
	
	public String toString(){
		return x + "\t" + y + "\t" + z;
	}
}
