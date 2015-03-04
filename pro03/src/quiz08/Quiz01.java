package quiz08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		Scanner scan=new Scanner(System.in);
		int number;
		
		System.out.print("입력할 커피의 갯수:");
		number=scan.nextInt();
		for(int i=0;i<number;i++){
			System.out.print("좋아하는 커피를"+number+"가지입력하세요:");
			hs.add(scan.next());
		}
		
		Iterator<String> iter=hs.iterator();
		System.out.println("입력하신 커피는:"+number);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		scan.close();
	}
}
