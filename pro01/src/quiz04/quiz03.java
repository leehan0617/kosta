package quiz04;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		question();
		answer(writeAnswer());
	}
	
	public static void question(){
		System.out.print("³ª »ç¶ûÇØ?(1:YES OR 2:NO)");
	}
	
	public static int writeAnswer(){
		int answer=0;
		Scanner scan = new Scanner(System.in);
		answer=scan.nextInt();
		scan.close();
		return answer;
	}
	
	private static void answer(int select) {
		if(select==1){
			System.out.println("¿ì¸° Ãµ»ý¿¬ºÐÀÎ°¡ ºÁ!!");
		}else if(select==2){
			System.out.println("²¨Á®!!");
		}else{
			System.out.println("Error");
		}
		
	}

}
