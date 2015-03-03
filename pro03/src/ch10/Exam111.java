package ch10;

/*
 * Collection:��ü�� ������.
 * 
 * Set: �ߺ����� ������� �ʰ�, ��������� ���� ���� �ʴ´�.
 * 		��)�Ҽ��� ���� x={a,b} y={c,d,e} ������,������,������
 * List:������(��ü) 1�������� �þ���� ������ �ڷᱸ��
 * Map: key,value(��ü) ����
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
		set.add(z); //auto�ڽ����� int -> Integer�� ��ȯ��
		set.add(new Integer(40));
		set.add(50);
		System.out.println(set); //���������� toString() ȣ��
		set.add(10); //�ߺ��� ������ �ϳ��������
		set.add(77);
		System.out.println(set); //set�� ��ü�� �������� ����� 
		
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
		
		Iterator<Object> iter=t.iterator(); //t�� �ִ� ��ü���� iter�� �����ؼ� ���ʴ�� �̾��ش�. �޸𸮿� ��������� �̴´�
		while(iter.hasNext()){
			System.out.print(iter.next()+"\t");
		}
	}

}
