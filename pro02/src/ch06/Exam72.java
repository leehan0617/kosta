package ch06;

class ParentsE{
	public void aa(){
		System.out.println("hihi");
	}
	
	public void bb(){}
	
	public void cc(){}
	
	public void dd(){}
}

class SonE extends ParentsE{
	public void aa(){
		System.out.println("hoho");
	}
	
	public void xx(){
		System.out.println("xx");
	}
}

public class Exam72 {
	public static void main(String[] args) {
		ParentsE p=new ParentsE();
		p.aa();
		
		SonE b=new SonE();
		b.aa();
		
		ParentsE p2=new SonE();
		p2.aa();
		//p2.xx(); error
	}
}
