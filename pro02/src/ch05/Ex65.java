package ch05;

class TestK{
	private String name;
	private int don;
	private static float iyu;
	
	TestK(String name,int don,float iyu){
		this.name=name;
		this.don=don;
		TestK.iyu=iyu;
	}
	
	public static void setIyu(float iyu){
		TestK.iyu=iyu;
	}
	
	public void disp(){
		System.out.println(name + "\t" + don + "\t" + iyu);
	}
}

public class Ex65 {
	public static void main(String[] args) {
		TestK t=new TestK("kim",100000,0.07f);
		
		t.disp();
	}
}
