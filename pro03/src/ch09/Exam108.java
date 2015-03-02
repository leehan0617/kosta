package ch09;

import java.util.Calendar;

public class Exam108 {
	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH) + 1;
		int day=today.get(Calendar.DATE);
		
		int hour=today.get(Calendar.HOUR);
		int minute=today.get(Calendar.MINUTE);
		int second=today.get(Calendar.SECOND);
		
		System.out.println(year+"년도");
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
	}

}
