package quiz07;

// ���� ���� ����� �������� ���α׷��� �ۼ��ϼ���. (indexOf(), subString() �Լ����) 

public class Quiz09 {
	public static void main(String[] args) {
		String fullPath="c:\\jdk1.5\\work\\PathSeparateTest.java";
		int index=fullPath.indexOf("P");
		System.out.println(fullPath.substring(index));
	}
}
