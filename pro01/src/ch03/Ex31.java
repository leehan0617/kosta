package ch03;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		//�����Ǽ��� �Է��ؼ� ���� ū���� ���� ������ ���
		Scanner scan=new Scanner(System.in);
		int[] array=new int[5];
		int maxValue,minValue;
		
		for(int i=0;i<array.length;i++){
			System.out.print("���� �Է��ϼ���:");
			array[i]=scan.nextInt();
		}
		
		maxValue=array[0]; minValue=array[0];
		
		for(int i=0;i<array.length;i++){
			if(maxValue<array[i]){
				maxValue=array[i];
			}
			if(minValue>array[i]){
				minValue=array[i];
			}
		}
		System.out.println("maxValue:"+maxValue+" minValue:"+minValue);
		scan.close();
	}

}