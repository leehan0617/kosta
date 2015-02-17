package ch05;

class SungJukA{
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	
	public SungJukA(int kor,int eng,int mat){
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
		System.out.println("±¹¾î:" + kor + " ¿µ¾î:" + eng + " ¼öÇÐ:" + mat);
		System.out.println("ÃÑÁ¡:" + total);
		System.out.println("Æò±Õ:" + avg);
	}
}
public class quiz1 {
	public static void main(String[] args) {
		SungJukA s=new SungJukA(70,80,90);
		s.total();
		s.avgerage();
		s.display();
	}
}
