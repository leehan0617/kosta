package quiz07;

class Count{
	public static boolean getCount(String input1,String input2){
		if(input1.indexOf(input2)!=-1){
			return true;
		}else
			return false;
	}
}

public class Quiz10 {
	public static void main(String[] args) {
		System.out.println(Count.getCount("ABCDE", "AB"));
		System.out.println(Count.getCount("ABCDE", "EF"));
	}
}
