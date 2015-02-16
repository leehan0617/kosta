package ch04;

import java.io.IOException;
import java.util.Scanner;

public class Ex43 {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		int su=0,value=0;
		char buho=' ';
		
		do{
		System.out.print("Input su:");
		su=scan.nextInt();
		System.out.print("Input buho:");
		buho=(char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("Input value:");
		value=scan.nextInt();
		}while(buho!='+' && buho!='-' && buho!='*' && buho!='/');
		
		if(buho=='+'){
			System.out.println("Result:"+plus(su,value));
		}else if(buho=='-'){
			System.out.println("Result:"+minus(su,value));
		}else if(buho=='*'){
			System.out.println("Result:"+mul(su,value));
		}else if(buho=='/'){
			System.out.println("Result:"+div(su,value));
		}
		scan.close();
		
	}
	
	public static int plus(int su,int value){
		return su+value;
	}
	public static int minus(int su,int value){
		return su-value;
	}
	public static int mul(int su,int value){
		return su*value;
	}
	public static float div(int su,int value){
		return (float)su/value;
	}
	
}
