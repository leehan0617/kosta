package ch09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam107 {
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		System.out.println(today);
		
		System.out.println(today.getYear() + "년도");
		System.out.println(today.getMonth() + 1 + "월");
		System.out.println(today.getDate() + "일");
		System.out.println(today.getHours() + "시");
		System.out.println(today.getMinutes() + "분");
		System.out.println(today.getSeconds() + "초");
		
		System.out.println("----------------------");
		
		Date date=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf3.format(date));
		
		String str="1998-12-20";
		Date strDate=sdf1.parse(str);
		System.out.println(strDate + "\t" + sdf2.format(strDate));
	}

}
