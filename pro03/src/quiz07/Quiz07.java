package quiz07;

import java.util.Scanner;

class FindNum{
	Scanner scan;
	int randomNumber=(int)(Math.random()*10);
	
	public void find(){
		int input=0;
		do{
			System.out.print("1부터 10까지 수를입력하세요.");
			scan=new Scanner(System.in);
			input=scan.nextInt();
			checkAnswer(input,randomNumber);
		}while(input!=randomNumber);
	}
	
	public void checkAnswer(int input,int randomNumber){
		if(input>randomNumber){
			System.out.println("더 작은수를 입력하세요.");
		}else if(input<randomNumber){
			System.out.println("더 큰수를 입력하세요.");
		}else
			System.out.println("맞췄습니다.[입력값"+input+",랜덤값:"+randomNumber+"]");
	}
	
	
}
public class Quiz07 {
	public static void main(String[] args) {
		FindNum fn=new FindNum();
		fn.find();
	}

}
