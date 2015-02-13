package quiz04;

public class quiz02 {
	public static void main(String[] args) {
		outChar('A');
		outDec(32767);
		outFloat(98.54f);
	}
	
	public static void outChar(char ch){
		System.out.println(ch);
	}
	protected static void outDec(int number){
		System.out.println(number);
	}
	private static void outFloat(float fNumber){
		System.out.println(fNumber);
	}

}
