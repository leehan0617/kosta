package ch04;
/*
 * �޸� ����
 * constant ����  : �������� , static ���� (���α׷� ���۵ɶ� �����ǰ� ����ɶ� ��������.)
 * heap     ����  : new(class,�迭)	   (�������÷���)
 * stack    ����  : �������� (�������� �����ǰ� ��������.)
 * register ����  : �켱�������� ����(�߾Ⱦ���)
 */
public class Ex39 {
	public static void main(String[] args) {
		int x=10;
		float y=20.5f;
		char ch='A';
		String str="hahaha";
		
		sub(x,y,ch,str);
	}
	
	public static void sub(int x, float y, char ch, String str){
		System.out.println(x);
		System.out.println(y);
		System.out.println(ch);
		System.out.println(str);
	}

}
