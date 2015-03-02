package ch09;

import java.text.DecimalFormat;

public class Exam106 {
	public static void main(String[] args) throws Exception {
		double x=1234567.89;
		
		DecimalFormat df1=new DecimalFormat("0");
		DecimalFormat df2=new DecimalFormat("0.0");
		DecimalFormat df3=new DecimalFormat("0.000");
		DecimalFormat df4=new DecimalFormat("00000000.000");
		System.out.println(df1.format(x));
		System.out.println(df2.format(x));
		System.out.println(df3.format(x));
		System.out.println(df4.format(x));
		System.out.println();
		
		DecimalFormat df5=new DecimalFormat("#");
		DecimalFormat df6=new DecimalFormat("#.#");
		DecimalFormat df7=new DecimalFormat("#.###");
		DecimalFormat df8=new DecimalFormat("########.##");
		System.out.println(df5.format(x));
		System.out.println(df6.format(x));
		System.out.println(df7.format(x));
		System.out.println(df8.format(x));
		System.out.println();
		
		int y=123456789;
		DecimalFormat df10=new DecimalFormat("#,###");
		DecimalFormat df11=new DecimalFormat("#,####");
		DecimalFormat df12=new DecimalFormat("#,#####");
		DecimalFormat df13=new DecimalFormat("\u00A4 #,###");
		System.out.println(df10.format(y));
		System.out.println(df11.format(y));
		System.out.println(df12.format(y));
		System.out.println(df13.format(y));
		System.out.println();
		
		String str="1,234,567";
		DecimalFormat df=new DecimalFormat("#,###");
		Number num=df.parse(str);
		int su=num.intValue();
		System.out.println(su);
	}

}
