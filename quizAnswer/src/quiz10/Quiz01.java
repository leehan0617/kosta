package quiz10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args){
		HashSet<String> set=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print("좋아하는 커피를 3가지입력하세요:");
			String str=sc.next();
			set.add(str);
		}
		
		System.out.println("입력하신 커피는:" + set.size());
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()){
			String str=iterator.next();
			System.out.println(str);
		}
		sc.close();
	}
}
