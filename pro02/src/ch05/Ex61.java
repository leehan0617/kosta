package ch05;

class TestB{
	private int x;
	private int y;
	
	TestB(){}
	
	TestB(int x){
		this.x=x;
	}
	
	TestB(int x,int y){
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y);
	}
	
	
}

public class Ex61 {
	public static void main(String[] args) {
		TestB a=new TestB();
		TestB b=new TestB(10);
		TestB c=new TestB(20,30);
		
		a.disp();
		b.disp();
		c.disp();
		
	}

}
