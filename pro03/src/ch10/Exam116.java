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
		
		System.out.println("2���� ���:" + list.get(2));
		System.out.println("list ũ��:" +list.size());
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		list.add(1,77);   //Ư�������� �߰� 
		list.add(88);	  //�߰�
		list.remove(0);   //����
		list.set(2, 99);  //Ư�������� ��ü
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("��Ʈ:" +list); //������������
	}

}
