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
			System.out.print("����:");
			String country=scan.next();
			System.out.print("�α�:");
			int man=scan.nextInt();	
			hm.put(country, man);
		}
		
		System.out.print("���� �Է��ϼ���:");
		input=scan.next();
		scan.close();
		for(String search:hm.keySet()){
			if(input.equals(search)){
				System.out.println("����:"+search);
				System.out.println("�α�:"+df.format(hm.get(search)));
			}
		}
	}
}
