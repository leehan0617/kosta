package ch05;

import java.util.Scanner;

class TestZ{
	private String name;
	private int age;
	private Scanner scan;
	
	public TestZ(){
		scan=new Scanner(System.in);
		
		System.out.print("name:");
		name=scan.next();
		
		System.out.print("age:");
		age=scan.nextInt();
		
		System.out.println();
	}
	
	public void disp(){
		System.out.println(name + "\t" + age);
	}
}

public class Ex64 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("inwon su:");
		int inwon=scan.nextInt();
		
		TestZ[] array=new TestZ[inwon];
		
		for(int i=0;i<array.length;i++){
			array[i]=new TestZ();
		}
		
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
		
		scan.close();
	}
}
