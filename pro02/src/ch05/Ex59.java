package ch05;

class Data{
	private int x;
	private int y;
	
	public void setData(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y);
	}
}

public class Ex59 {
	public static void main(String[] args) {
		Data a=new Data();
		a.setData(10,20);
		a.disp();
		
		Data b=new Data();
		b.setData(77,88);
		b.disp();
	}
}
