package ch04;
/*
 * 메모리 DS(Data Sagment) :
 * 1)constant 영역: 프로그램 시작될때 생겨서 종료될때 없어진다.
 * 				   static 변수
 * 2)heap     영역: new
 * 3)stack    영역: 지역변수 {}
 * 4)register 영역:
 */
public class Ex49 {
	public static int su=50;
	public static final int num=50;
	
	public static void main(String[] args){
		int x=10;
		int y=20;
		final int z=50; //final : 값을 변경못하게 설정
		//System.out.println(z); //error
		aa();
		su=77;
		//num=30; //error
		System.out.println(su+x+y);
		System.out.println(z+num);
		aa();
	}
	
	public static void aa(){
		int z=10;
		//System.out.println(x+"+"+y); //error
		System.out.println(su+z);
	}

}
