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
			System.out.print("���� �Է��ϼ���:");
			firstNumber=scan.nextInt();
			
			System.out.print("��ȣ�� �Է��ϼ���:");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("���� �Է��ϼ���:");
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
