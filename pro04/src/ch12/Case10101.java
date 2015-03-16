package ch12;

import java.util.Scanner;

public class Case10101 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int gak1,gak2,gak3;
		int tot;
		Scanner scan=new Scanner(System.in);
		gak1=scan.nextInt();
		gak2=scan.nextInt();
		gak3=scan.nextInt();
		
		tot=gak1+gak2+gak3;
		
		if(tot!=180){ 
			System.out.println("Error");
			System.exit(1);
		}
		
		if(gak1==60 && gak2==60 && gak3==60){
			System.out.println("Equilater");
			return;
		}
		
		if(tot==180 && (gak1==gak2 ||gak2==gak3 || gak1==gak3)){
			System.out.println("Isosceles");
			return;
		}
		
		if(tot==180 && (gak1!=gak2 || gak2!=gak3 || gak1!=gak3)){
			System.out.println("Scalene");
			return;
		}
		scan.close();
	}
}
