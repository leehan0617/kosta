package quiz08;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz05 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"\t");
		}
	}
}
