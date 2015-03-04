package quiz10;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] ar){		
		HashMap<String, String> map=new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print("이름:");
			String name=sc.next();
			
			System.out.print("전화번호:");
			String phone=sc.next();
			
			map.put(name,phone);
			
			System.out.println();
		}
		
		System.out.print("전화번호를 검색할 이름을 입력하세요:");
		String key=sc.next();
		if(key !=null){
			String value=(String) map.get(key);
			System.out.println(key + "의 전화번호는" + value + "입니다.");
		}
		sc.close();
	}
}
