package ch04;
/*
 * �޸� DS(Data Sagment) :
 * 1)constant ����: ���α׷� ���۵ɶ� ���ܼ� ����ɶ� ��������.
 * 				   static ����
 * 2)heap     ����: new
 * 3)stack    ����: �������� {}
 * 4)register ����:
 */
public class Ex49 {
	public static int su=50;
	public static final int num=50;
	
	public static void main(String[] args){
		int x=10;
		int y=20;
		final int z=50; //final : ���� ������ϰ� ����
		//System.out.println(z); //error
		aa();
		su=77;
		//num=30; //error
		System.out.println(su+x+y);
		System.out.println(z+num);
		aa();
	}
	
	public static void aa(){
		int z=10;
		//System.out.println(x+"+"+y); //error
		System.out.println(su+z);
	}

}
