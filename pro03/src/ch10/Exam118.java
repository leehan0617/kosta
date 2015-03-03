package ch10;

import java.util.ArrayList;

public class Exam118 {
	public static void main(String[] args) {
		AA a=new AA(10,20);
		AA b=new AA(30,40);
		AA c=new AA(50,60);
		
		ArrayList<AA> list=new ArrayList<AA>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i=0;i<list.size();i++){
			AA ab=list.get(i);
			ab.yonsan();
			ab.disp();
		}
		
		list.add(new AA(70,80));
		list.set(2, new AA(90,90));
		list.remove(0);
		for(int i=0;i<list.size();i++){
			AA ab=list.get(i);
			ab.yonsan();
			ab.disp();
		}
		System.out.println(list);
	}

}
