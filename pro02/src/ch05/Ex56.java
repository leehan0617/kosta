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
		System.out.println("�̸�:"+name);
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+mat);
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
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
 * ���)
 * �̸�;ȫ�浿
 * ����:70
 * ����:60
 * ����:55
 * ����:xxx
 * ���:xx.x
 */