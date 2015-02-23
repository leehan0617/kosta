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
		
		System.out.print("이름:");
		name=scan.next();
		
		System.out.print("국어:");
		kor=scan.nextInt();
		
		System.out.print("수학:");
		mat=scan.nextInt();
		
		System.out.print("영어:");
		eng=scan.nextInt();
	}
	
	public void calJumsu(){
		total=kor+eng+mat;
		avg=(float)total/3;
		totalSum+=total;
		totalAvg=(float)totalSum/(3*num);
	}
	
	public static void title(){
		System.out.println("이름" + "\t" + "국어" + "\t" + "수학" + "\t" + "영어" + "\t" + "총점" + "\t" + "평균");	
	}
	
	public void display(){
		System.out.println(name + "\t" + kor + "\t" + mat + "\t" + eng + "\t" + total + "\t" + avg);
	}
	
	public static void displayAll(){
		System.out.println("==============================================");
		System.out.println("반총점:" + totalSum + "\t" + "반평균:" + totalAvg +"\t" + "총인원:" + num);
	}
}

public class quiz07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number;
		
		System.out.print("인원수를 입력하세요:");
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
