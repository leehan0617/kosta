package quiz07;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input;
		String[] array=new String[3];
		int[] array2=new int[3];
		String[] days=new String[]{"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		System.out.print("날짜입력하세요 (입력예:2012/01/07):");
		input=scan.next();
		
		StringTokenizer st=new StringTokenizer(input,"/");
		for(int i=0;i<array.length;i++){
			array[i]=st.nextToken();
			array2[i]=Integer.parseInt(array[i]);
		}
		
		GregorianCalendar gregorian=new GregorianCalendar(array2[0],array2[1],array2[2]);
		int year=gregorian.get(Calendar.YEAR);
		int month=gregorian.get(Calendar.MONTH);
		int date=gregorian.get(Calendar.DATE);
		int day=gregorian.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년"+month+"월"+date+"일"+days[day]);
		
		scan.close();
	}

}
