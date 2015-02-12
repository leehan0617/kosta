package quiz02;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input su1:");
		int a=sc.nextInt(); 		 // 6
		
		System.out.print("input su2:");
		int b=sc.nextInt(); 	 // 4
		
		System.out.print("input su3:");
		int c=sc.nextInt();  	 // 7
		
		int temp=0;
		if(a > b){     			// 6 > 4
			if(a > c){   			// 6 > 7
				temp=a;
			}else{
				temp=c;       // temp 7
			}
		}else if(b > a){
			if(b > c){
				temp=b;
			}else{
				temp=c;
			}	
		}
		
		System.out.println("a:" + a + "\t" + "b:" + b + "\t" + "c:" + c);
		System.out.println("max:" +temp);
		
		sc.close();
	}

}
