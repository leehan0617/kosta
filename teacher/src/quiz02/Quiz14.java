package quiz02;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int plusCount=0, minusCount=0;
		
		for(int i=0;i<10;i++){
			System.out.print("���� �Է��ϼ���:");
			int su=sc.nextInt();
			if(su > 0){
				plusCount++;
			}else{
				minusCount++;
			}
		}

		System.out.println("�������:" + plusCount);
		System.out.println("��������:" + minusCount);
		
		sc.close();
	}
}
