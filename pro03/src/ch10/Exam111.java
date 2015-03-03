package ch10;

/*
 * Collection:객체를 모은다.
 * 
 * Set: 중복값을 허용하지 않고, 저장순서가 유지 되지 않는다.
 * 		예)소수의 집합 x={a,b} y={c,d,e} 합집합,교집합,차집합
 * List:데이터(객체) 1차원으로 늘어놓은 형태의 자료구조
 * Map: key,value(객체) 구성
 */
import java.util.HashSet;
import java.util.Iterator;

public class Exam111 {
	public static void main(String[] args) {
		Integer i=new Integer(10);
		Integer j=new Integer(20);
		Integer k=new Integer(30);
		int z=55;
		
		HashSet<Integer> set=new HashSet<Integer> ();
		set.add(i);
		set.add(j);
		set.add(k);
		set.add(z); //auto박싱으로 int -> Integer로 변환됨
		set.add(new Integer(40));
		set.add(50);
		System.out.println(set); //내부적으로 toString() 호출
		set.add(10); //중복값 허용안함 하나만출력함
		set.add(77);
		System.out.println(set); //set에 객체는 랜덤으로 저장됨 
		
		HashSet<String> e=new HashSet<String> ();
		e.add("apple");
		e.add("banana");
		e.add("tomato");
		e.add("apple");
		System.out.println(e);
		
		e.remove("apple");
		e.add("melon");
		System.out.println(e);
		
		HashSet<Object> t=new HashSet<Object>();
		t.add(10);
		t.add(24.5f);
		t.add("abc");
		System.out.println(t);
		
		Iterator<Object> iter=t.iterator(); //t에 있는 객체들을 iter에 저장해서 차례대로 뽑아준다. 메모리에 들어간순서대로 뽑는다
		while(iter.hasNext()){
			System.out.print(iter.next()+"\t");
		}
	}

}
