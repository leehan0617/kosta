package bb;

import java.util.Date;

import aa.AA;

class Test extends Date{
	public Test(){
		super();
	}
	
	public Test(int year,int month,int date){
		super(year,month,date);
	}
	
	public void aa(){
		
	}
	
	public int getData(){
		return 10;
	}
}

public class CC extends AA {
	public void disp(){
//		System.out.println(x); error
		System.out.println(y);
		System.out.println(z);
	}
}
