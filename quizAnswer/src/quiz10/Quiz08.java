package quiz10;

import java.text.DecimalFormat;
import java.util.ArrayList;

class Sung{
	private String name;
	private int kor, eng, mat, tot;
	private float avg;
	
	public Sung(String name, int kor, int eng, int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	public void total(){
		tot=kor+eng+mat;
	}
	
	public void average(){
		avg=(float)tot/3;
	}
	
	public void disp(){
		DecimalFormat df=new DecimalFormat(".0");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + df.format(avg));
	}
	
	public static void title(){
		System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균");
	}
}

public class Quiz08 {
	public static void main(String[] ar){
		Sung a=new Sung("홍길동", 100, 70, 80);
		Sung b=new Sung("이순신", 88, 77, 66);
		Sung c=new Sung("강감찬", 70, 80, 70);
		
		ArrayList<Sung> list=new ArrayList<Sung>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		Sung.title();
		for(int i=0;i<list.size();i++){
			Sung sung=list.get(i);
			sung.total();
			sung.average();
			sung.disp();
		}		
	}
}
