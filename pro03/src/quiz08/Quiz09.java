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
			System.out.print("�̸�:");
			student.setName(scan.next());
			System.out.print("�а�:");
			student.setDept(scan.next());
			System.out.print("�й�:");
			student.setNumber(scan.next());
			System.out.print("����:");
			student.setAvg(scan.nextFloat());
			hm.put(student.getNumber(), student);
		}
		
		System.out.println();
		System.out.print("�˻��� �й�:");
		findNum=scan.next();
		scan.close();
		
		for(String key:hm.keySet()){
			if(findNum.equals(key)){
				System.out.println(hm.get(findNum));
				return;
			}else{
				System.out.println("�׷� �й��� ���������ʽ��ϴ�.");
				return;
			}
		}
	}
}
