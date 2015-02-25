package ch07;

class AA{
	private int x,y;
	
	public void setXY(int x,int y){
		this.x=x;
		this.y=y;
	} 
	public void disp(){
		System.out.println(x + "\t" + y);
//		aa(); error
		BB b=new BB();
		b.aa();
	}
	
	class BB{ 
		private int su;
		
		public void setSu(int su){
			this.su=su;
		}
		
		public void output(){
			System.out.println(x + "\t" + y);
			System.out.println(su);
			
			x=200;
			disp();
		}
		
		public void aa(){}
	}
}

public class Exam77 {
	public static void main(String[] args) {
		AA a=new AA(); // x,y,setXY,disp
		a.setXY(10, 20);
		a.disp();
//		a.output(); error
		
		AA b=new AA();
		b.setXY(77, 88);
		AA.BB ab=b.new BB();
//		ab.setXY(10,20); error
		ab.setSu(99);
		ab.output();
	}
}
