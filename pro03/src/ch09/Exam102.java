package ch09;

public class Exam102 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("** JAVA");
		System.out.println("str:" + str);
		System.out.println("����:" + str.length());
		System.out.println("�Ҵ�ȿ뷮:" + str.capacity());
		System.out.println("���ڿ� �����ֱ�:" + str.insert(3, "Good"));
		System.out.println("str:" + str);
		
		System.out.println("5��° ���ڿ� ã��:" + str.charAt(4));
		System.out.println("�������:" + str.reverse());
		System.out.println("str" + str);
	}

}
