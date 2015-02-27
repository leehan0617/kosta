package ch09;

public class Exam101 {
	public static void main(String[] args) {
		String s1="새천년";
		String s2="대한민국";
		String s3="만세";
		System.out.println("s1 hash code:" + s1.hashCode());
		System.out.println("s2 hash code:" + s2.hashCode());
		System.out.println("s3 hash code:" + s3.hashCode());
		
		s1+=s2;
		System.out.println("s1+s2 hash code:" + s1.hashCode()+"\n");
		
//		StringBuffer는 대용량 String을 처리할때 좋음
		StringBuffer s4=new StringBuffer("새천년");
		StringBuffer s5=new StringBuffer("대한민국");
		System.out.println("s4 Hash code:" + s4.hashCode());
		System.out.println("s5 Hash code:" + s5.hashCode());
		
		s4.append(s5);
		System.out.println(s4);
		System.out.println("s4 Hash code:" + s4.hashCode());
		s4.append("만세");
		System.out.println(s4);
		System.out.println("s4 Hash code:" + s4.hashCode());
	}
}
