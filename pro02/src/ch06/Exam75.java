package ch06;

class XX{
	public int x=10;
}

interface YY{
	public int y=20;     //final variable
	
	public void sub();   //abstract method
}

interface TT{
	public int k=10;
	
	public void sub2();
}

interface AA extends YY{
	public void sub3();
}

class ZZ extends XX implements YY,TT{
	public void output(){
		x=77;
		//y=88; error
		System.out.println(x + "\t" + y);
	}
	
	public void sub(){
		System.out.println("YY");
	}
	
	public void sub2(){
		System.out.println("TT");
	}
}

public class Exam75 {
	public static void main(String[] args) {
		ZZ z=new ZZ();
		z.output();
		z.sub();
	}
}
