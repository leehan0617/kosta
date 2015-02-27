package ch09;

public class Exam102 {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("** JAVA");
		System.out.println("str:" + str);
		System.out.println("길이:" + str.length());
		System.out.println("할당된용량:" + str.capacity());
		System.out.println("문자열 끼워넣기:" + str.insert(3, "Good"));
		System.out.println("str:" + str);
		
		System.out.println("5번째 문자열 찾기:" + str.charAt(4));
		System.out.println("역순출력:" + str.reverse());
		System.out.println("str" + str);
	}

}
