package exam;

import java.util.Calendar;

public class Case10699 {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"-"+month+"-"+day);
	}

}
