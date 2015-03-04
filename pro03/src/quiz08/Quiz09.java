package quiz08;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		HashMap<String,Student> hm=new HashMap<String,Student>();
		Scanner scan=new Scanner(System.in);
		String findNum;
		
		for(int i=0;i<3;i++){
			Student student=new Student();
			System.out.print("이름:");
			student.setName(scan.next());
			System.out.print("학과:");
			student.setDept(scan.next());
			System.out.print("학번:");
			student.setNumber(scan.next());
			System.out.print("학점:");
			student.setAvg(scan.nextFloat());
			hm.put(student.getNumber(), student);
		}
		
		System.out.println();
		System.out.print("검색할 학번:");
		findNum=scan.next();
		scan.close();
		
		for(String key:hm.keySet()){
			if(findNum.equals(key)){
				System.out.println(hm.get(findNum));
				return;
			}else{
				System.out.println("그런 학번은 존재하지않습니다.");
				return;
			}
		}
	}
}
