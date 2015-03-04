package quiz10;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args){	
		HashMap<String, Long> map=new HashMap<String, Long>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<1;i++){
			System.out.print("나라:");
			String country=sc.next();
			
			System.out.print("인구:");
			long population=sc.nextLong();
			
			map.put(country, population);
			
			System.out.println();
		}
		
		System.out.print("검색할 나라의 이름을 입력하세요:");
		String key=sc.next();
		if(key !=null){
			Long value=(Long) map.get(key);
			DecimalFormat d=new DecimalFormat("#, ###");		
			System.out.println(key + "의 나라의 인구는" + d.format(value) + "명 입니다.");
		}else{
			System.out.println("입력하신 나라가 없습니다.");
		}
		
		sc.close();
	}
}
