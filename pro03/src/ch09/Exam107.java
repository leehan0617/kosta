package ch09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam107 {
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println(today);
		
		System.out.println(today.getYear() + "�⵵");
		System.out.println(today.getMonth() + 1 + "��");
		System.out.println(today.getDate() + "��");
		System.out.println(today.getHours() + "��");
		System.out.println(today.getMinutes() + "��");
		System.out.println(today.getSeconds() + "��");
		
		System.out.println("----------------------");
		
		Date date=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy�� MM�� dd�� E����");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf3.format(date));
		
		String str="1998-12-20";
		Date strDate=sdf1.parse(str);
		System.out.println(strDate + "\t" + sdf2.format(strDate));
	}

}
