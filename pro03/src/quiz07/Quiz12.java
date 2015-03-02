package quiz07;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.StringTokenizer;

/*
 * 12. ���ڿ� "123,456,777.5"�� �Ҽ��� ù ��° �ڸ����� �ݿø� �ϰ� �� ���� ���������� 
    �ĸ�(,)�� �����ؼ� ���
[���ȭ��] �ݿø�:123456778
	  ������:123,456,778

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
		System.out.println("�ݿø�:"+roundNum);
		
		DecimalFormat df=new DecimalFormat("###,###,###");
		System.out.println("������:"+df.format(roundNum));
	}
}
