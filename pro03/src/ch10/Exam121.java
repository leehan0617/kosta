package ch10;

/* Map: key값이 중복되면 안된다.
 * 		들어갈때 순서없이 들어간다.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam121 {
	public static void main(String[] args) {
		HashMap<String,Integer> ht=new HashMap<String,Integer>();
		
		ht.put("akey", 10);
		ht.put("bkey", 20);
		ht.put("ckey", 30);
		
		System.out.println(ht); //내부 toString호출
		System.out.println(ht.get("akey"));
		
		ht.remove("akey");
		ht.put("dkey", 40);
		ht.remove("ckey",77);
		System.out.println(ht);
		
		//key 출력 
		Set<String> set=ht.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
//			System.out.print(iter.next()+"\t");
			System.out.print("value:"+ht.get(iter.next())+"\t");
		}
		System.out.println();
		System.out.println("=====================");
		
		//value 출력
		Collection<Integer> colle=ht.values();
		Iterator<Integer> it=colle.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
	}

}
