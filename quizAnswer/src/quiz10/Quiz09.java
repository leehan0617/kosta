package quiz10;

import java.util.HashMap;
import java.util.Scanner;


class Student{
	private String name;
	private String deptName;
	private String number;
	private float average;
	private 	Scanner sc;
	
	public Student(){
		sc=new Scanner(System.in);
		System.out.print("이름:");
		name=sc.next();
		
		System.out.print("학과:");
		deptName=sc.next();
		
		System.out.print("학번:");
		number=sc.next();
		
		System.out.print("학점평균:");
		average=sc.nextFloat();
		System.out.println();
	}
	
	public void disp(){
		System.out.println(name + "\t" + deptName + "\t" + number + "\t" + average);
	}
	
	public String getNumber(){
		return number;
	}
}

public class Quiz09 {
	public static void main(String[] args) {	
		Student kim=new Student(); 
		Student park=new Student();
		Student lee=new Student();
		Student cho=new Student();
		Student hong=new Student();
		
		HashMap<String, Student> map=new HashMap<String, Student>();
		map.put(kim.getNumber(), kim);
		map.put(park.getNumber(), park);
	    map.put(lee.getNumber(), lee);
	    map.put(cho.getNumber(), cho);
	    map.put(hong.getNumber(), hong);
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.print("검색할 학번을 입력하세요:");
	    String number=sc.next();
	    
	    Student result=(Student) map.get(number);
	    result.disp();
	    sc.close();
	}
}







