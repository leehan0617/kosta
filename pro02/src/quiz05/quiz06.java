package quiz05;

import java.io.IOException;
import java.util.Scanner;

class Calculate{
	private int firstNumber;
	private int secondNumber;
	private int resultNumber;
	private float divNumber;
	private char buho;
	
	public Calculate() throws IOException{
		Scanner scan=new Scanner(System.in);
		
		do{
			System.out.print("수를 입력하세요:");
			firstNumber=scan.nextInt();
			
			System.out.print("부호를 입력하세요:");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("수를 입력하세요:");
			secondNumber=scan.nextInt();
		}while(buho !='+' && buho !='-' && buho !='/' && buho !='*');
	}
	
	public void doCal(){
		switch(buho){
		case '+':
			resultNumber=firstNumber+secondNumber;
			break;
		case '-':
			resultNumber=firstNumber-secondNumber;
			break;
		case '*':
			resultNumber=firstNumber*secondNumber;
			break;
		case '/':
			divNumber=(float)firstNumber/secondNumber;
			break;
		}
	}
	
	public void display(){
		if(buho == '/')
			System.out.println(firstNumber+""+buho+secondNumber+"="+(divNumber));
		else
			System.out.println(firstNumber+""+buho+secondNumber+"="+(resultNumber));
	}
}

public class quiz06 {
	public static void main(String[] args) throws IOException {
		Calculate c=new Calculate();
		c.doCal();
		c.display();
	}
}
