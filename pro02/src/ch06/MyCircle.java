package ch06;

import java.util.Scanner;

public class MyCircle extends MyPoint {
	private int r;
	
	@Override
	public void input() {
		sc=new Scanner(System.in);
		
		System.out.print("x:");
		x=sc.nextInt();
		
		System.out.print("y:");
		y=sc.nextInt();
		
		System.out.print("r:");
		r=sc.nextInt();
	}

	@Override
	public void output() {
		System.out.println(x + "\t" + y + "\t" + r);
	}

}
