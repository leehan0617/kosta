package ch10;

import java.util.HashSet;
import java.util.Iterator;

public class Exam112 {
	public static void main(String[] args) {
		AA a=new AA(10,20);
		AA b=new AA(30,40);
		
		HashSet<AA> set=new HashSet<AA>();
		set.add(a);
		set.add(b);
		
		Iterator<AA> iter=set.iterator();
		while(iter.hasNext()){
			AA ab=iter.next();
			ab.yonsan();
			ab.disp();
		}
		System.out.println("------------------");
		
		set.remove(a);
		AA c=new AA(77,88);
		c.yonsan();
		
		System.out.println(set); //toString 메소드 출력
	}
}
