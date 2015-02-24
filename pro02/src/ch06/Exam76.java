package ch06;

class ParentsH{
	protected int x;
	
	public void aa(){
		System.out.println("aa Function");
	}
	
	public final void bb(){
		System.out.println("bb Function");
	}
}

class SonH extends ParentsH{
	public void sub(){
		super.aa();
		super.bb();
	}
	
	public void aa(){}
//	public void bb(){} error
}

public class Exam76 {
	public static void main(String[] args) {
		SonH s=new SonH();
		s.aa();
		s.bb();
	}
}
