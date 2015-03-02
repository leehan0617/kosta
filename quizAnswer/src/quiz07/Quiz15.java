package quiz07;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��¥�Է��ϼ���(�Է¿�:2012/01/07):");
		String str=sc.next();
		
		try {
			SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd");
			Date date=sdf1.parse(str);
			
			SimpleDateFormat sdf2=new SimpleDateFormat("E����");
			System.out.println(sdf2.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
