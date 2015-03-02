package ch09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam109 {
	public static void main(String[] args) {
		GregorianCalendar calendar=new GregorianCalendar();
		
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH) + 1;
		int date=calendar.get(Calendar.DATE);
		
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		
		int ampm=calendar.get(Calendar.AM_PM);
		
		System.out.print(year+"년");
		System.out.print(month+"월");
		System.out.print(date+"일");
		System.out.print(hour+"시");
		System.out.print(minute+"분");
		System.out.print(second+"초");
		System.out.print(ampm==0 ? "오전" : "오후");
		System.out.println();
		
		GregorianCalendar gregorian=new GregorianCalendar(1980,7,4);
		int y=gregorian.get(Calendar.YEAR);
		int m=gregorian.get(Calendar.MONTH);
		int d=gregorian.get(Calendar.DATE);
		System.out.println(y+"년"+m+"월"+d+"일");
		
		Date dt=calendar.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(dt));
	}
	
}
