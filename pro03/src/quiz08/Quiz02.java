package quiz08;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print("�̸�:");
			String name=scan.next();
			System.out.print("��ȭ��ȣ:");
			String phone=scan.next();
			hm.put(name, phone);
		}

		System.out.print("�˻��� �̸��� ������:");
		String name=scan.next();
		scan.close();
		
		for(String key:hm.keySet()){
			if(name.equals(key)){
				System.out.print(key+"�� ��ȭ��ȣ��"+hm.get(key)+"�Դϴ�.");
			}
		}
	}
}
