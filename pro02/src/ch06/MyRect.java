package ch06;

import java.util.Scanner;

public class MyRect extends MyPoint {
	private int w,h;
	
	@Override
	public void input() {
		sc=new Scanner(System.in);
		
		System.out.print("x:");
		x=sc.nextInt();
		
		System.out.print("y:");
		y=sc.nextInt();
		
		System.out.print("w:");
		w=sc.nextInt();
		
		System.out.print("h:");
		h=sc.nextInt();
	}

	@Override
	public void output() {
		System.out.println(x + "\t" + y + "\t" + w + "\t" + h);
	}

}
