package quiz05;

import java.io.IOException;
import java.util.Scanner;

class Employee{
	private String name;         //�̸�
	private int number;			 //���
	private int age;             //����
	private String rank;         //����
	private String department;   //�ٹ��μ�
	private char grade;          //�λ���
	
	public void input() throws IOException{
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸�:");
		name=scan.next();
		
		System.out.print("���:");
		number=scan.nextInt();
		
		System.out.print("����:");
		age=scan.nextInt();
		
		System.out.print("�ٹ��μ�:");
		department=scan.next();
		
		System.out.print("����:");
		rank=scan.next();
		
		System.out.print("�λ���:");
		grade=(char)System.in.read();
		System.in.read();
		System.in.read();
	}
	
	public void output(){
		System.out.println("�̸�:"+name+"\t"+"���:"+number+"\t"+"����"+age+"\t"+"�ٹ��μ�:"+department+"\t"+"����:"+rank+"\t"+"�λ���:"+grade);
	}
}

public class quiz01 {
	public static void main(String[] args) throws IOException{
		Employee emp=new Employee();
		emp.input();
		emp.output();
	}
}
