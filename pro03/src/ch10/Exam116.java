package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class Exam116 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("2번지 출력:" + list.get(2));
		System.out.println("list 크기:" +list.size());
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		list.add(1,77);   //특정번지에 추가 
		list.add(88);	  //추가
		list.remove(0);   //삭제
		list.set(2, 99);  //특정번지에 교체
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("소트:" +list); //오름차순만됨
	}

}
