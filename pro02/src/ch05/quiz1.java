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
		System.out.println("����:" + kor + " ����:" + eng + " ����:" + mat);
		System.out.println("����:" + total);
		System.out.println("���:" + avg);
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
