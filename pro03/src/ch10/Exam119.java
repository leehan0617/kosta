package ch10;

import java.util.Vector;

public class Exam119 {
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println(vec.get(2));
		for(int i=0;i<vec.size();i++){
			System.out.print(vec.get(i) + "\t");
		}
		System.out.println();
		
		vec.add(55);
		vec.add(2,77);
		vec.set(1, 99);
		vec.remove(2);
		System.out.println(vec);
		System.out.println();
		
		Vector<Integer> vec1=new Vector<Integer>(4,3);  //����ũ�⸦ 4����� 4�� �ʰ��Ǹ� 3���ø���.
		System.out.println("ũ��"+vec1.size());       //0
		System.out.println("�뷮:"+vec1.capacity());  //4
		vec1.add(500);
		vec1.add(600);
		vec1.add(700);
		vec1.add(800);
		vec1.add(900);
		
		System.out.println("--------------------");
		System.out.println("ũ��"+vec1.size());       //5
		System.out.println("�뷮:"+vec1.capacity());  //7
	}

}
