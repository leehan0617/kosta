package quiz05;

import java.io.IOException;
import java.util.Scanner;

class Employee{
	private String name;         //이름
	private int number;			 //사번
	private int age;             //나이
	private String rank;         //직함
	private String department;   //근무부서
	private char grade;          //인사등급
	
	public void input() throws IOException{
		Scanner scan=new Scanner(System.in);
		System.out.print("이름:");
		name=scan.next();
		
		System.out.print("사번:");
		number=scan.nextInt();
		
		System.out.print("나이:");
		age=scan.nextInt();
		
		System.out.print("근무부서:");
		department=scan.next();
		
		System.out.print("직함:");
		rank=scan.next();
		
		System.out.print("인사등급:");
		grade=(char)System.in.read();
		System.in.read();
		System.in.read();
	}
	
	public void output(){
		System.out.println("이름:"+name+"\t"+"사번:"+number+"\t"+"나이"+age+"\t"+"근무부서:"+department+"\t"+"직함:"+rank+"\t"+"인사등급:"+grade);
	}
}

public class quiz01 {
	public static void main(String[] args) throws IOException{
		Employee emp=new Employee();
		emp.input();
		emp.output();
	}
}
