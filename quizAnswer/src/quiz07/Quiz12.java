package quiz07;

import java.text.DecimalFormat;

// ���ڿ� "123,456,777.5"�� �Ҽ��� ù ��° �ڸ����� �ݿø� �ϰ� �� ���� �������ٸ� �ĸ�(,)�� �����ؼ� ���
public class Quiz12 {
	public static void main(String[] args) throws Exception{
		String str="123,456,777.5";
		DecimalFormat df=new DecimalFormat("#,###.#");
		Number num=df.parse(str);
		double d=num.doubleValue();
		
		DecimalFormat dft=new DecimalFormat("#,###");
		
		System.out.println("�ݿø�:" + Math.round(d));
		System.out.println("������:" + dft.format(d));
	}
}
