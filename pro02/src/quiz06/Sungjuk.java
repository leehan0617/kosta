package quiz06;

public class Sungjuk extends Person {
	public int total(){
		return super.getTot();
	}
	
	public float average(){
		return super.getAvg();
	}
	
	public void disp(){
		System.out.println("이름:"+super.getName());
		System.out.println("국어점수:"+super.getKor());
		System.out.println("수학점수:"+super.getMat());
		System.out.println("영어점수:"+super.getEng());
		System.out.println("총점:"+total());
		System.out.println("평균:"+average());
	}

}
