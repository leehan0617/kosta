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
		
		System.out.println(year+"�⵵");
		System.out.println(month+"��");
		System.out.println(day+"��");
		System.out.println(hour+"��");
		System.out.println(minute+"��");
		System.out.println(second+"��");
	}

}
