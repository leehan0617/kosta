package quiz08;

import java.util.Scanner;
import java.util.Vector;

public class Quiz06 {
	public static void main(String[] args) {
		Vector<Float> vc=new Vector<Float>();
		Scanner scan=new Scanner(System.in);
		float max=Float.MIN_VALUE;
		
		for(int i=0;i<3;i++){
			System.out.print("�Ǽ��� �Է��ϼ���:");
			float f=scan.nextFloat();
			vc.add(f);
			if(vc.get(i)>max){
				max=vc.get(i);
			}
		}
		
		System.out.println("����ū����:"+max);
		scan.close();
	}
}
