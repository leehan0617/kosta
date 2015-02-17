package quiz05;

class Circle{
	private double radius; //원의반지름
	private double area;   //원의 넓이
	private final double pi=3.14; //원주율  
	
	public void getRadius(double radius){
		this.radius=radius;
	}
	
	public void findArea(){
		area=radius*radius*pi;
	}
	
	public void disp(){
		System.out.println("원의 면적:"+area);
	}
	
}

public class quiz02 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}
}
