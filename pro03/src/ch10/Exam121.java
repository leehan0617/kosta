package ch10;

/* Map: key���� �ߺ��Ǹ� �ȵȴ�.
 * 		���� �������� ����.
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
		
		System.out.println(ht); //���� toStringȣ��
		System.out.println(ht.get("akey"));
		
		ht.remove("akey");
		ht.put("dkey", 40);
		ht.remove("ckey",77);
		System.out.println(ht);
		
		//key ��� 
		Set<String> set=ht.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
//			System.out.print(iter.next()+"\t");
			System.out.print("value:"+ht.get(iter.next())+"\t");
		}
		System.out.println();
		System.out.println("=====================");
		
		//value ���
		Collection<Integer> colle=ht.values();
		Iterator<Integer> it=colle.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
	}

}
