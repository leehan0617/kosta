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
		System.out.println("�̸�:"+name);
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+mat);
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
	}
	
}

public class Ex54 {
	public static void main(String[] args) {
		Sung s=new Sung();
		s.input("ȫ�浿",70,60,55);
		
		s.total();
		s.average();
		s.display();
	}

}

/*
 * ���)
 * �̸�;ȫ�浿
 * ����:70
 * ����:60
 * ����:55
 * ����:xxx
 * ���:xx.x
 */