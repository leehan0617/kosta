package ch04;

import java.util.Scanner;

public class Ex40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="";
		int kor=0,eng=0,mat=0;
		
		System.out.print("name:");
		name =scan.next();
		System.out.print("kor:");
		kor=scan.nextInt();
		System.out.print("eng:");
		eng=scan.nextInt();
		System.out.print("mat");
		mat=scan.nextInt();
		
		System.out.println("name:"+name);
		total(kor,eng,mat);
		average(kor,eng,mat);
		scan.close();
		
	}
	
	public static void total(int kor,int eng,int mat){
		int tot=kor+eng+mat;
		System.out.println("tot:"+tot);
	}
	
	public static void average(int kor,int eng,int mat){
		float avg=(float)(kor+eng+mat)/3;
		System.out.println("avg:"+avg);
	}

}
