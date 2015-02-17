package quiz05;

class ABS{
	private int number;
	
	public void setValue(int number){
		this.number=number;
	}
	
	public void resultAbs(){
		if(number<0)
			number=-number;
	}
	
	public void disp(){
		System.out.println("result:"+number);
	}
}

public class quiz03 {
	public static void main(String[] args) {
		ABS abs=new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}
}
