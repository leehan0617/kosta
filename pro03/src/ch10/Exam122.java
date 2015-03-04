package ch10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam122 {
	public static void main(String[] args) {
		HashMap<Integer,Double> ht=new HashMap<Integer,Double>();
		ht.put(1,10.0);
		ht.put(2,13.3);
		ht.put(3,12.3);
		System.out.println(ht);
		System.out.println();
		System.out.println("=========================");
		
		//key출력
		Set<Integer> set=ht.keySet();
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext()){
//			System.out.println(iter.next());
			System.out.print(ht.get(iter.next())+"\t");
		}
		System.out.println();
		System.out.println("=========================");
		
		//value출력
		Collection<Double> colle=ht.values();
		Iterator<Double> iter2=colle.iterator();
		while(iter2.hasNext()){
			System.out.print(iter2.next()+"\t");
		}
	}
}
