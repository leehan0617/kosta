package ch05;

class SungJukA{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	
	public SungJukA(String name,int kor,int eng,int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	public void total(){
		total=kor+mat+eng;
	}
	
	public void avgerage(){
		avg=(float)total/3;
	}
	
	public void display(){
		System.out.println("ÀÌ¸§:"+ name + " ±¹¾î:" + kor + " ¿µ¾î:" + eng + " ¼öÇÐ:" + mat);
		System.out.println("ÃÑÁ¡:" + total);
		System.out.println("Æò±Õ:" + avg);
	}
}
public class quiz1 {
	public static void main(String[] args) {
		SungJukA s=new SungJukA("È«±æµ¿",70,80,90);
		s.total();
		s.avgerage();
		s.display();
	}
}
