package quiz07;
//  ���ڿ��� �����ϸ� true, �׷��� ������ false�� ��ȯ�ϴ� ���α׷��ۼ� (indexOf())
//  ����) indexOf �Լ��� �ش� ���ڰ� ������ �� ������ index���� ��ȯ �ϰ� ������ -1 ���� ��ȯ�Ѵ�.

class Count{
	public static boolean getCount(String src, String targe){
			return src.indexOf(targe) != -1;
	}	
}

public class Quiz10 {
	public static void main(String[] args) {
		System.out.println(Count.getCount("ABCDE", "AB"));
		System.out.println(Count.getCount("ABCDE", "EF"));
	}
}
