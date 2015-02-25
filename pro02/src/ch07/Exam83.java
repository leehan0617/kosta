package ch07;

class II{
	public void aa(){
		System.out.println("aa Function");
	}
	
	public void bb(){
		System.out.println("bb Function");
	}
	
	public void cc(){
		System.out.println("cc Function");
	}
}

public class Exam83 {
	public static void main(String[] args) {
		final int x=10;
		
		II f=new II(){
			//함수 재정의
			public void aa(){
				System.out.println("subsubsub");
				System.out.println(x);
//				x=30; error
//				클래스 밖의 변수는 final만 가능
//				새로운 메소드 추가시 내부에서만 호출가능
				dd();
			}
			
			public void dd(){
				System.out.println("dd Function");
			}
		};
		
		f.aa();
		f.bb();
		f.cc();
//		f.dd(); error
	}

}
