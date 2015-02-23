package quiz05;

import java.util.Scanner;

class Answer{
	private String name;
	private int kor,eng,mat,total;
	private float avg;
	private static int num;
	private static int totalSum=0;
	private static float totalAvg=0.0f;

	public Answer(){
		++num;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�̸�:");
		name=scan.next();
		
		System.out.print("����:");
		kor=scan.nextInt();
		
		System.out.print("����:");
		mat=scan.nextInt();
		
		System.out.print("����:");
		eng=scan.nextInt();
	}
	
	public void calJumsu(){
		total=kor+eng+mat;
		avg=(float)total/3;
		totalSum+=total;
		totalAvg=(float)totalSum/(3*num);
	}
	
	public static void title(){
		System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");	
	}
	
	public void display(){
		System.out.println(name + "\t" + kor + "\t" + mat + "\t" + eng + "\t" + total + "\t" + avg);
	}
	
	public static void displayAll(){
		System.out.println("==============================================");
		System.out.println("������:" + totalSum + "\t" + "�����:" + totalAvg +"\t" + "���ο�:" + num);
	}
}

public class quiz07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number;
		
		System.out.print("�ο����� �Է��ϼ���:");
		number=scan.nextInt();
		
		Answer[] a=new Answer[number];

		for(int i=0;i<a.length;i++){
			a[i]=new Answer();
		}
		
		Answer.title();
		
		for(int i=0;i<a.length;i++){
			a[i].calJumsu();
			a[i].display();
		}
		
		Answer.displayAll();
		scan.close();
	}
}
