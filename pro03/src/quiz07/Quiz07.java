package quiz07;

import java.util.Scanner;

class FindNum{
	Scanner scan;
	int randomNumber=(int)(Math.random()*10);
	
	public void find(){
		int input=0;
		do{
			System.out.print("1���� 10���� �����Է��ϼ���.");
			scan=new Scanner(System.in);
			input=scan.nextInt();
			checkAnswer(input,randomNumber);
		}while(input!=randomNumber);
	}
	
	public void checkAnswer(int input,int randomNumber){
		if(input>randomNumber){
			System.out.println("�� �������� �Է��ϼ���.");
		}else if(input<randomNumber){
			System.out.println("�� ū���� �Է��ϼ���.");
		}else
			System.out.println("������ϴ�.[�Է°�"+input+",������:"+randomNumber+"]");
	}
	
	
}
public class Quiz07 {
	public static void main(String[] args) {
		FindNum fn=new FindNum();
		fn.find();
	}

}
