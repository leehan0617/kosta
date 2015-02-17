package ch05;

import java.util.Scanner;

class Sungjuk{
	private String name;
	private int kor,eng,mat,total;
	private float avg;
	
	public void input(){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Name:");
		name=scan.next();
		
		System.out.print("Kor:");
		kor=scan.nextInt();
		
		System.out.print("Eng:");
		eng=scan.nextInt();
		
		System.out.print("Math:");
		mat=scan.nextInt();
		
		//scan.close();
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

public class Ex56 {
	public static void main(String[] args) {
		Sungjuk s=new Sungjuk();
		s.input();
		s.total();
		s.average();
		s.display();
		
		Sungjuk x=new Sungjuk();
		x.input();
		x.total();
		x.average();
		x.display();
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