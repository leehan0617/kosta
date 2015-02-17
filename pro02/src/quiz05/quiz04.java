package quiz05;

class Plus{
	private int x;
	private int y;
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getX(){
		return x+1;
	}
	
	public int getY(){
		return y+1;
	}
}

public class quiz04 {
	public static void main(String[] args) {
		Plus p=new Plus();
		p.setX(10);
		p.setY(20);
		
		System.out.println(p.getX() + "," + p.getY());
	}
}
