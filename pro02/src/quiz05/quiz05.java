package quiz05;

class HakJum{
	private int jumsu;
	private char grade;
	
	public HakJum(int jumsu){
		this.jumsu=jumsu;
	}
	
	public void result(){
		if(jumsu>=90){
				grade='A';
			}else if(jumsu>=80){
				grade='B';
			}else if(jumsu>=70){
				grade='C';
			}else if(jumsu>=60){
				grade='D';
			}else if(jumsu>=50){
				grade='E';
			}else grade='F';
	}
	
	public void disp(){
		System.out.println("jumsu:" + jumsu + "\t" + "grade:" + grade);
	}
}

public class quiz05 {
	public static void main(String[] args) {
		HakJum h=new HakJum(88);
		h.result();
		h.disp();
	}
}
