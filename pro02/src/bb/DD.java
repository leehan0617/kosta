package bb;

import aa.AA;

public class DD {
	public static void main(String[] args) {
		AA a=new AA();
//		System.out.println(a.x); error
//		System.out.println(a.y); error
		System.out.println(a.z);
		
		Test t=new Test();
		System.out.println("date:"+t.getDate());
	}	
}
