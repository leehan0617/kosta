package quiz05;

class Circle{
	private double radius; //���ǹ�����
	private double area;   //���� ����
	private final double pi=3.14; //������  
	
	public void getRadius(double radius){
		this.radius=radius;
	}
	
	public void findArea(){
		area=radius*radius*pi;
	}
	
	public void disp(){
		System.out.println("���� ����:"+area);
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
