package quiz07;

import java.util.StringTokenizer;

/*
 * 14. 다음 문자열 자바가, 수업, 보이는, KOSTA를 배열에 담아 아래와 같이 출력하세요.
 [출력화면]
자바가 보이는 수업 KOSTA

 */
public class Quiz14 {
	public static void main(String[] args) {
		String str="자바가, 수업, 보이는, KOSTA";
		StringTokenizer stok=new StringTokenizer(str,",");
		String str2="";
		
		while(stok.hasMoreTokens()){
			str2+=stok.nextToken();
		}
		
		System.out.println(str2);
	}

}
