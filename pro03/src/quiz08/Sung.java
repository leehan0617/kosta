package quiz08;

public class Sung {
	private  String name;
	private int kor,eng,mat,tot;
	private float avg;
	
	public Sung(String name,int kor,int eng,int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	public void total(){
		tot=kor+mat+eng;
	}
	
	public void average(){
		avg=(float)tot/3;
	}
	
	public void disp(){
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
	}
	
	public static void title(){
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	}
}
