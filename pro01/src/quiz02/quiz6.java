package quiz02;

import java.io.IOException;

/*
 * Ű����κ��� �Է��� ���ڰ� M �Ǵ� m �̸� man ,
 * W�Ǵ� w�̸� woman
 * �� �� �̸� ???�� ȭ��� ǥ���ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class quiz6 {
	public static void main(String[] args) throws IOException{
		char input =' ';
		
		System.out.print("input character:");
		input = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		if(input =='m' || input =='M'){
			System.out.println("Man");
		}else if(input =='w' || input=='W'){
			System.out.println("Woman");
		}else{
			System.out.println("???");
		}
	}

}
