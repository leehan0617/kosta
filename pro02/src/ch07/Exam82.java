package ch07;	

class GG{
	private int x=100;
	private static int y=200;
	
	public static void aa(){}
	public void bb(){}
	
	public void disp(){
		class HH{
			private int a=66;
//			private static int b=77;error
			
			public void print(){
				System.out.println(x+"\t"+y);
				System.out.println(a);
				aa();
				bb();
			}
			
//			public void static xx(){} error
		}
		
		HH h=new HH();
		h.print();
	}
}
public class Exam82 {
	public static void main(String[] args) {
		GG g=new GG();
		g.disp();
	}
}
