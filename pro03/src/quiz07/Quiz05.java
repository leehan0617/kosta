package quiz07;

class SutdaCard{
	int number;
	boolean logic=false;
	
	public SutdaCard(int input,boolean logic){
		number=input;
		this.logic=logic;
	}
	
	public boolean equals(SutdaCard s){
		SutdaCard sc=new SutdaCard(number,logic);
		if(sc.number==s.number && sc.logic==s.logic){
			return true;
		}else
			return false;
	}
}
public class Quiz05 {
	public static void main(String[] args) {
		SutdaCard s=new SutdaCard(3, true);
		SutdaCard u=new SutdaCard(3, true);
		System.out.println("°á°ú:" + s.equals(u));
	}	
}
