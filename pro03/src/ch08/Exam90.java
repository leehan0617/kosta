package ch08;

class AA{
	public void aa() throws Throwable{
		System.out.println("aa Function");
		
		Throwable ex=new Throwable("aa Function");
		throw ex;
	}
	
	public void bb() throws Throwable{
		System.out.println("bb Function");
		aa();
	}
}

public class Exam90 {
	public static void main(String[] args){
		AA a=new AA();
		char x=' ';
		
		try{
			a.bb();
			x=(char)System.in.read();
			System.in.read();
			System.in.read();
		}catch(Throwable e){
			System.out.println("Error");
		}
		
		System.out.println(x);
	}
}
