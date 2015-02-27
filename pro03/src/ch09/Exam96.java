package ch09;

public class Exam96 {
	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		
		System.out.println("max:" + max + "\t" + "min" + min);
		
		int value=10;
		System.out.println("2진수출력:" + Integer.toBinaryString(value));
		System.out.println("8진수출력:" + Integer.toOctalString(value));
		System.out.println("16진수출력:"+ Integer.toHexString(value));
		
		String str="10";
		Integer number=new Integer(str);
		System.out.println("number:" + ++number);
		
		Integer suObj=Integer.valueOf(str);
		System.out.println("suObj:" + ++suObj);
		
		int su=Integer.parseInt(str);
		System.out.println("su:" + ++su);
	}
}
