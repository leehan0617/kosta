package ch09;

public class Exam100 {
	public static void main(String[] args) {
		StringBuffer strA=new StringBuffer("Hello java");
		System.out.println("strA:" + strA);
		System.out.println("strA의 길이:" + strA.length());
		System.out.println("strA의 할당:" + strA.capacity()); //10+16
		System.out.println();
		
		StringBuffer strB=new StringBuffer("How are you?");
		System.out.println("strB:" + strB);
		System.out.println("strB의 길이:" + strB.length());
		System.out.println("strB의 할당:" + strB.capacity()); //12+16
		System.out.println();
	}

}
