package ch07;

class II{
	public void aa(){
		System.out.println("aa Function");
	}
	
	public void bb(){
		System.out.println("bb Function");
	}
	
	public void cc(){
		System.out.println("cc Function");
	}
}

public class Exam83 {
	public static void main(String[] args) {
		final int x=10;
		
		II f=new II(){
			//�Լ� ������
			public void aa(){
				System.out.println("subsubsub");
				System.out.println(x);
//				x=30; error
//				Ŭ���� ���� ������ final�� ����
//				���ο� �޼ҵ� �߰��� ���ο����� ȣ�Ⱑ��
				dd();
			}
			
			public void dd(){
				System.out.println("dd Function");
			}
		};
		
		f.aa();
		f.bb();
		f.cc();
//		f.dd(); error
	}

}
