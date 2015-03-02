package quiz07;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.StringTokenizer;

/*
 * 12. 문자열 "123,456,777.5"를 소수점 첫 번째 자리에서 반올림 하고 그 값을 만단위마다 
    컴마(,)로 구분해서 출력
[출력화면] 반올림:123456778
	  만단위:123,456,778

 */
public class Quiz12 {
	public static void main(String[] args) throws ParseException {
		String str="123,456,777.5";
		StringTokenizer st=new StringTokenizer(str, ",");
		String str2="";
		
		while(st.hasMoreTokens()){
			str2+=st.nextToken();
		}
		
		double d=Double.parseDouble(str2);
		int roundNum=(int)Math.round(d);
		System.out.println("반올림:"+roundNum);
		
		DecimalFormat df=new DecimalFormat("###,###,###");
		System.out.println("만단위:"+df.format(roundNum));
	}
}
