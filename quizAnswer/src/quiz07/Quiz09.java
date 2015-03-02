package quiz07;

// 다음 실행 결과가 나오도록 프로그램을 작성하세요. (indexOf(), subString() 함수사용) 

public class Quiz09 {
	public static void main(String[] args) {
		String fullPath="c:\\jdk1.5\\work\\PathSeparateTest.java";
		int index=fullPath.indexOf("P");
		System.out.println(fullPath.substring(index));
	}
}
