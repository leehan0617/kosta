package ch05;

public class Ex68 {
	public int y=20;
	public static int z=30; //Ŭ���������� ����
	public final int a=100; //���� ġȯ�� �� ����.
	public static final int b=200;
	
	public static void main(String[] args) {
		int x=10;
//		static int value=30; error
		final int su=24;
		
		System.out.println(x+""+su);
	}
	
	public void aa(){
		bb();
		cc();
		dd();
	}
	public static void bb(){
		dd();
	}
	public final void cc(){
		aa();
		bb();
		dd();
	}
	public static final void dd(){
		bb();
	}
}
