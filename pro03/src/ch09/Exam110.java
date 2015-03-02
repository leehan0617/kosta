package ch09;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Exam110 {
	public static void main(String[] args) {
		TimeZone zone=TimeZone.getTimeZone("Asia/Tokyo");
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTimeZone(zone);
		
		int month=gc.get(Calendar.MONTH)+1;
		int date=gc.get(Calendar.DATE);
		int hour=gc.get(Calendar.HOUR);
		int minute=gc.get(Calendar.MINUTE);
		int ampm=gc.get(Calendar.AM_PM);
		
		System.out.println(month+"��"+date+"��"+hour+"��"+minute+"��"+ (ampm==0 ? "����" : "����"));
	}

}
