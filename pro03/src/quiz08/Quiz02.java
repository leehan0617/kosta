package quiz08;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.print("이름:");
			String name=scan.next();
			System.out.print("전화번호:");
			String phone=scan.next();
			hm.put(name, phone);
		}

		System.out.print("검색할 이름을 쓰세요:");
		String name=scan.next();
		scan.close();
		
		for(String key:hm.keySet()){
			if(name.equals(key)){
				System.out.print(key+"의 전화번호는"+hm.get(key)+"입니다.");
			}
		}
	}
}
