package quiz02;

import java.util.Scanner;

/*
 * 10���� ������ �Է� �޾Ƽ� ����� ������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���. (for��)
  [���ȭ��]
  ���� �Է��ϼ���:1
  ���� �Է��ϼ���:2
  ���� �Է��ϼ���:-3
  ���� �Է��ϼ���:-4
  ���� �Է��ϼ���:-5
  ���� �Է��ϼ���:6
  ���� �Է��ϼ���:7
  ���� �Է��ϼ���:8
  ���� �Է��ϼ���:9
  ���� �Է��ϼ���:-10
  �������:6
  ��������:4
*/
public class quiz14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int plusNum=0,minusNum=0;
		int input;
		for(int i=1;i<=10;i++){
			System.out.print("���� �Է��ϼ���:");
			input = scan.nextInt();
			if(input >0) plusNum++;
			if(input <0) minusNum++;
		}
		System.out.println("�������:"+plusNum);
		System.out.println("��������:"+minusNum);
		scan.close();
	}

}