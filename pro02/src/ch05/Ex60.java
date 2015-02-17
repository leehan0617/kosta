package ch05;

class TestA{
	private int x;
	private int y;
	
	public TestA(){}
	
	public TestA(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x+"\t"+y);
	}
}

public class Ex60 {
	public static void main(String[] args) {
		TestA t=new TestA(10,20);
		t.disp();
		
		TestA t3=new TestA(55,77);
		t3.disp();
		
		TestA t2=new TestA();
		t2.disp();
	}

}
