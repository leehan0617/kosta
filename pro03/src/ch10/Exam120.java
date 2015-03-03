package ch10;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Exam120 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		System.out.println(list); //내부적으로 toString 발생
		
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"\t");
		}
		
		for(String obj:list){
			System.out.print(obj+"\t");
		}
		
		int[] array=new int[] {10,20,30,40,50};
		for(int a:array){
			System.out.println(a+"\t");
		}
		System.out.println();
		System.out.println("------------------");
		
		Vector<String> vec=new Vector<String>();
		vec.add("one");
		vec.add("two");
		vec.add("three");
		
		System.out.println(vec);
		
		for(int i1=0;i1<vec.size();i1++){
			System.out.print(vec.get(i1)+"\t");
		}
		System.out.println();
		System.out.println("======================");
		
		Iterator<String> iter2=vec.iterator();
		while(iter2.hasNext()){
			System.out.print(iter2.next()+"\t");
		}
		System.out.println();
		System.out.println("=======================");
		
		for(String str:vec){
			System.out.print(str+"\t");
		}
		
		//Vector ->Enumeration ->Iterator ->ArrayList
		Enumeration<String> en=vec.elements();
		while(en.hasMoreElements()){
			System.out.print(en.nextElement()+"\t");
		}
		System.out.println();
	}

}
