package ch03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number;
		System.out.print("�ο����� �Է�:");
		number=scan.nextInt();
		
		String[] name=new String[number];
		int[] kor=new int[number];
		int[] eng=new int[number];
		int[] mat=new int[number];
		int[] tot=new int[number];
		float[] avg=new float[number];
		
		for(int i=0;i<number;i++){
			System.out.print("�̸�:");
			name[i]=scan.next();
			System.out.print("����:");
			kor[i]=scan.nextInt();
			System.out.print("����:");
			eng[i]=scan.nextInt();
			System.out.print("����:");
			mat[i]=scan.nextInt();
		}
		
		for(int i=0;i<number;i++){
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.0f;
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0;i<number;i++){
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		
		scan.close();
	}

}
