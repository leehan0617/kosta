package quiz10;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz05 {
	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=1;i<=20;i++){
			array.add(new Integer(i));
		}
		
		Iterator<Integer> iter=array.iterator();
		while(iter.hasNext()){
			Integer su=iter.next();
			System.out.print(su + "\t");
			if(su==10) System.out.println();
		}
	}
}
