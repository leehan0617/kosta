package ch09;

public class Exam101 {
	public static void main(String[] args) {
		String s1="��õ��";
		String s2="���ѹα�";
		String s3="����";
		System.out.println("s1 hash code:" + s1.hashCode());
		System.out.println("s2 hash code:" + s2.hashCode());
		System.out.println("s3 hash code:" + s3.hashCode());
		
		s1+=s2;
		System.out.println("s1+s2 hash code:" + s1.hashCode()+"\n");
		
//		StringBuffer�� ��뷮 String�� ó���Ҷ� ����
		StringBuffer s4=new StringBuffer("��õ��");
		StringBuffer s5=new StringBuffer("���ѹα�");
		System.out.println("s4 Hash code:" + s4.hashCode());
		System.out.println("s5 Hash code:" + s5.hashCode());
		
		s4.append(s5);
		System.out.println(s4);
		System.out.println("s4 Hash code:" + s4.hashCode());
		s4.append("����");
		System.out.println(s4);
		System.out.println("s4 Hash code:" + s4.hashCode());
	}
}
