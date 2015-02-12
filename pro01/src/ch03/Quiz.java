package ch03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number;
		System.out.print("인원수를 입력:");
		number=scan.nextInt();
		
		String[] name=new String[number];
		int[] kor=new int[number];
		int[] eng=new int[number];
		int[] mat=new int[number];
		int[] tot=new int[number];
		float[] avg=new float[number];
		
		for(int i=0;i<number;i++){
			System.out.print("이름:");
			name[i]=scan.next();
			System.out.print("국어:");
			kor[i]=scan.nextInt();
			System.out.print("영어:");
			eng[i]=scan.nextInt();
			System.out.print("수학:");
			mat[i]=scan.nextInt();
		}
		
		for(int i=0;i<number;i++){
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.0f;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<number;i++){
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		
		scan.close();
	}

}
