package ch05;
/*
 * �� �ڹ����Ͼȿ� Ŭ������ 2���̻��϶��� ����Ŭ������ �����ϰ� 
 * public,private,protected..������Ҽ� ����.
 */

class Yonsan{
	public int x,y,z;
	
	public int plus(int x,int y){
		return x+y;
	}
	
	public void sum(){
		z=x+y;
	}
	
	public void display(){
		System.out.println(z);
	}
}

public class Ex53 {
	public static void main(String[] args) {
		Yonsan yon=new Yonsan();
		yon.x=10;
		yon.y=20;
		yon.sum();
		yon.display();
		
		Yonsan c=new Yonsan();
		c.x=77;
		c.y=88;
		c.sum();
		c.display();
	}

}
