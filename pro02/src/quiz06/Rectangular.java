package quiz06;

public class Rectangular extends Figure{
	private float area;
	private float around;
	private float radius;
	
	public Rectangular(float radius) {
		this.radius=radius;
	}

	public void area() {
		area=radius*radius;
	}
	
	public float setArea(){
		area();
		return area;
	}
	
	public void around() {
		around=4*radius;
	}
	
	public float setAround(){
		around();
		return around;
	}
	
	public void disp(){
		System.out.println("사각형의 면적:"+setArea());
		System.out.println("사각형의 둘레:"+setAround());
	}
}
