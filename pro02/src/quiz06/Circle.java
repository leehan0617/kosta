package quiz06;

public class Circle extends Figure{
	private int radius;
	private float area;
	private float around;
	private final float pi=3.141592f;
	
	public Circle(int radius){
		this.radius=radius;
	}
	
	public float setArea(){
		area();
		return area;
	}

	public void area(){
		area=radius*radius*pi;
	}
	
	public float setAround(){
		around();
		return around;
	}
	
	public void around(){
		around=2*pi*radius;
	}
	
	public void disp(){
		System.out.println("원의 면적:"+setArea());
		System.out.println("원의 둘레:"+setAround());
	}
}
