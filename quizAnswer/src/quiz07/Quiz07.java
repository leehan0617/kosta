package quiz07;


import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int answer=(int) (Math.random() * 10) + 1;
		System.out.println("answer:" + answer);
		
		int input=0;
		do{
			System.out.print("1�� 10������ ���� �Է��ϼ���:");
			input=sc.nextInt();
			
			if(answer > input){
				System.out.println("�� ū���� �Է��ϼ���.");
			}else if(answer < input){
				System.out.println("�� �������� �Է��ϼ���.");
			}else{
				System.out.println("������ϴ�." + "[�Է°�:" + input  + ", ������:" + answer + "]");
				break;
			}
			
		}while(true);

		sc.close();
	}
}
