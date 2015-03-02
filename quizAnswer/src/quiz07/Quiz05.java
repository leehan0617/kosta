package quiz07;

/* 다음 화면을 참조하여 클래스를 작성하세요. (equals() 오버라이딩)  */

class SutdaCard{
	private int num;
	public boolean isKwang;
	
	public SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public boolean equals(Object obj){
		SutdaCard card=(SutdaCard) obj;
		boolean result=false;
		
		if(this.num==card.num && this.isKwang==card.isKwang){
			result=true;
		}
		
		return result;
	}
}

public class Quiz05 {
	public static void main(String[] args) {
		SutdaCard s=new SutdaCard(3, true);
		SutdaCard u=new SutdaCard(3, true);
		System.out.println("결과:" + s.equals(u));
	}	
}
