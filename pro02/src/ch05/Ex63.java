package ch05;

class TestY{
	private int x,y;
	
	public TestY(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y);
	}
}
public class Ex63 {
	public static void main(String[] args) {
		TestY[] array=new TestY[3];
		array[0]=new TestY(10,20);
		array[1]=new TestY(6,20);
		array[2]=new TestY(70,20);
		
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
	}
}
