package quiz08;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		Scanner scan=new Scanner(System.in);
		String input;
		DecimalFormat df=new DecimalFormat("#,###");
		
		for(int i=0;i<3;i++){
			System.out.print("나라:");
			String country=scan.next();
			System.out.print("인구:");
			int man=scan.nextInt();	
			hm.put(country, man);
		}
		
		System.out.print("나라를 입력하세요:");
		input=scan.next();
		scan.close();
		for(String search:hm.keySet()){
			if(input.equals(search)){
				System.out.println("나라:"+search);
				System.out.println("인구:"+df.format(hm.get(search)));
			}
		}
	}
}
