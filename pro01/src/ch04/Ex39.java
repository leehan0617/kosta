package ch04;
/*
 * 메모리 구조
 * constant 영역  : 전역변수 , static 변수 (프로그램 시작될때 생성되고 종료될때 없어진다.)
 * heap     영역  : new(class,배열)	   (가비지컬렉션)
 * stack    영역  : 지역변수 (블럭단위로 생성되고 없어진다.)
 * register 영역  : 우선순위높은 변수(잘안쓰임)
 */
public class Ex39 {
	public static void main(String[] args) {
		int x=10;
		float y=20.5f;
		char ch='A';
		String str="hahaha";
		
		sub(x,y,ch,str);
	}
	
	public static void sub(int x, float y, char ch, String str){
		System.out.println(x);
		System.out.println(y);
		System.out.println(ch);
		System.out.println(str);
	}

}
