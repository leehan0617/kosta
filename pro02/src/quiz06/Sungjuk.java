package quiz06;

public class Sungjuk extends Person {
	public int total(){
		return super.getTot();
	}
	
	public float average(){
		return super.getAvg();
	}
	
	public void disp(){
		System.out.println("�̸�:"+super.getName());
		System.out.println("��������:"+super.getKor());
		System.out.println("��������:"+super.getMat());
		System.out.println("��������:"+super.getEng());
		System.out.println("����:"+total());
		System.out.println("���:"+average());
	}

}
