package quiz07;

import java.util.Scanner;

class Quiz03_sub{
	public int input;
	public Scanner scan;
	
	public void inputNum(){
		scan=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		input=scan.nextInt();
		checkError(input);
	}
	
	public void checkError(int input){
		try{
			
		}catch(NumberFormatException e){
			System.out.println("�����߻�!! ��Ȯ�� 10�ڸ��� �Է� �����մϴ�.");
		}finally{
			if(scan !=null)
				scan.close();
		}
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		Quiz03_sub qs=new Quiz03_sub();
		qs.inputNum();
	}
}
