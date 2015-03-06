package ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Exam135 {
	public static void main(String[] args) throws IOException{
		System.out.println("hahaha");
		
		PrintStream ps=System.out;
		ps.println("출력");
		
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("문자형(String):");
		String str=br.readLine();
		
		System.out.print("정수형:");
		int x=Integer.parseInt(br.readLine());
		
		System.out.print("실수형:");
		float f=Float.parseFloat(br.readLine());
		
		System.out.print("문자(char):");
		char z=(char)isr.read();
		
		System.out.println("str:"+str+"\tx:"+x+"\tf:"+f+"\tz:"+z);
	}
}
