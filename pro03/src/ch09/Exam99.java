package ch09;

public class Exam99 {
	public static void main(String[] args) {
		String url="Http://www.kma.go.kr/test/test.jsp";
		
		System.out.println("문자열 출력:"+url.substring(25));
		System.out.println("문자열 출력:"+url.substring(2,5));
		System.out.println("문자열 출력:"+url.indexOf(':'));
		System.out.println("문자열 치환:"+url.replace("Http://www.kma.go.kr/test/test.jsp","Web Address"));
		System.out.println("url:"+url+"\n");
		
		System.out.println("대문자출력:" + url.toUpperCase());
		System.out.println("소문자출력:" + url.toLowerCase());
		System.out.println("url:"+url+"\n");
		
		if(url.startsWith("Http:"))
			System.out.println("문자열 시작 검색");
		
		if(url.endsWith("jsp"))
			System.out.println("문자열의 끝 검색합니다." + "\n");
		
		String str="자바프로그래밍";
		System.out.println(str.concat("입문"));
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}
}
