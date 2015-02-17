package ch05;

class Sub{
	public int x;
	public int y;
	
	public void setX(int a){
		x=a;
	}
	
	public void setY(int b){
		y=b;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
		
}

public class Ex57 {
	public static void main(String[] args) {
		Sub s=new Sub();
		s.setX(10);
		s.setY(20);
		System.out.println(s.getX() + "\t" + s.getY());
	}
}
