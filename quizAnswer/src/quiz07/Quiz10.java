package quiz07;
//  문자열을 포함하면 true, 그렇지 않으면 false를 반환하는 프로그램작성 (indexOf())
//  참조) indexOf 함수는 해당 문자가 있으면 그 문자의 index값을 반환 하고 없으면 -1 값을 반환한다.

class Count{
	public static boolean getCount(String src, String targe){
			return src.indexOf(targe) != -1;
	}	
}

public class Quiz10 {
	public static void main(String[] args) {
		System.out.println(Count.getCount("ABCDE", "AB"));
		System.out.println(Count.getCount("ABCDE", "EF"));
	}
}
