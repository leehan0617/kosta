package ch05;

class Sung{
	private String name;
	private int kor,eng,mat,total;
	private float avg;
	
	public void input(String n,int k,int e,int m){
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}
	
	public void total(){
		total=kor+eng+mat;
	}
	
	public void average(){
		avg=total/3.0f;
	}
	
	public void display(){
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
	
}

public class Ex54 {
	public static void main(String[] args) {
		Sung s=new Sung();
		s.input("홍길동",70,60,55);
		
		s.total();
		s.average();
		s.display();
	}

}

/*
 * 결과)
 * 이름;홍길동
 * 국어:70
 * 영어:60
 * 수학:55
 * 총점:xxx
 * 평균:xx.x
 */