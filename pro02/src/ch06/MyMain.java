package ch06;

import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MyPoint[] m=new MyPoint[10];
		
		for(int i=0;i<m.length;i++){
			System.out.print("1.�� 2.�簢�� 3.��ü���� 4.����");
			int x=sc.nextInt();
//			
//			switch(x){
//				case 1:
//					m[i]=new MyCircle();
//					m[i].input();
//					break;
//				case 2:
//					m[i]=new MyRect();
//					m[i].input();
//					break;
//				case 3:
//					for(int j=0;j<i;j++){
//						m[j].output();
//					}
//					--i;
//					break;
//				case 4:
//					return ;
//				default:
//					System.out.println("Error");
//					--i;
//			}
			if(x==1){
				m[i]=new MyCircle();
				m[i].input();
			}else if(x==2){
				m[i]=new MyRect();
				m[i].input();
			}else if(x==3){
				for(int j=0;j<i;j++){
					m[j].output();
				}
				--i;
			}else if(x==4){
				return ;
				//System.exit(0); ��������
			}else{
				System.out.println("Error");
				--i;
			}
		}
		sc.close();
	}
}
