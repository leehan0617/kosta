package ch04;

public class Ex34 {
	public static void main(String[] args) {
//  접근제한자,지정예약어,반환형,함수명(매개변수)
//  main함수는 컴파일러만 호출 가능
		sub();
		System.out.println("hahaha");
		sub();
		System.out.println("hohoho");
	}
	
	//call by name
	public static void sub(){
		System.out.println("안녕하세요.");
	}
	
	public static void aa(){
		
	}

}
