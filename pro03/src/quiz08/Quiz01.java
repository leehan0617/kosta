package quiz08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		Scanner scan=new Scanner(System.in);
		int number;
		
		System.out.print("�Է��� Ŀ���� ����:");
		number=scan.nextInt();
		for(int i=0;i<number;i++){
			System.out.print("�����ϴ� Ŀ�Ǹ�"+number+"�����Է��ϼ���:");
			hs.add(scan.next());
		}
		
		Iterator<String> iter=hs.iterator();
		System.out.println("�Է��Ͻ� Ŀ�Ǵ�:"+number);
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		scan.close();
	}
}
