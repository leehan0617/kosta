package ch06;

abstract class ParentsG{
	public abstract void disp();
}

class SonG extends ParentsG{
	public void disp(){
		System.out.println("SonG Class");
	}
}

class DaughterG extends ParentsG{
	public void disp(){
		System.out.println("DaughterG Class");
	}
}

public class Exam74 {
	public static void main(String[] args) {
		ParentsG g=new SonG();
		g.disp();
		
		ParentsG g2=new DaughterG();
		g2.disp();
		
//		ParentsG g3=new ParentsG(); error
	}
}
