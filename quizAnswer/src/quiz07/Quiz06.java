package quiz07;

/* 다음 화면을 참조하여 클래스를 작성하세요. (toString(), equals() 오버라이딩)  */

class Point{
	private int x, y, z;
	
	public Point(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public boolean equals(Object obj){
		Point p=(Point) obj;
		boolean result=false;
		
		if(this.x==p.x && this.y==p.y && this.z==p.z){
			result=true;
		}
		return result;
	}
	
	public String toString(){
		return "[" + x  +"\t" +  y + "\t" + z + "]";
	}
}
public class Quiz06 {
	public static void main(String[] args) {
		Point p=new Point(1, 2, 3);
		Point o=new Point(1, 2, 3);
		
		System.out.println(p);
		System.out.println(o);
		System.out.println("결과:" + p.equals(o));
	}
}
