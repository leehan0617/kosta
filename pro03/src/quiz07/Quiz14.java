package quiz07;

import java.util.StringTokenizer;

/*
 * 14. ���� ���ڿ� �ڹٰ�, ����, ���̴�, KOSTA�� �迭�� ��� �Ʒ��� ���� ����ϼ���.
 [���ȭ��]
�ڹٰ� ���̴� ���� KOSTA

 */
public class Quiz14 {
	public static void main(String[] args) {
		String str="�ڹٰ�, ����, ���̴�, KOSTA";
		StringTokenizer stok=new StringTokenizer(str,",");
		String str2="";
		
		while(stok.hasMoreTokens()){
			str2+=stok.nextToken();
		}
		
		System.out.println(str2);
	}

}
