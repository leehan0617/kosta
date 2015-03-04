package ch10;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class Exam123 {
	public static void main(String[] args) {
		HashMap<String,AA> hs=new HashMap<String,AA>();
		AA a=new AA(10,20);
		AA b=new AA(30,40);
		AA c=new AA(60,60);
		
		hs.put("a", a);
		hs.put("b", b);
		hs.put("c", c);
		
		AA abc=hs.get("a");
		abc.yonsan();
		abc.disp();
		
		Set<String> set=hs.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
			AA all=hs.get(iter.next());
			all.yonsan();
			all.disp();
		}
		System.out.println("==============");
		
		Collection<AA> colle=hs.values();
		Iterator<AA> iter2=colle.iterator();
		while(iter2.hasNext()){
			AA all=iter2.next();
			all.yonsan();
			all.disp();
		}
	}
}
