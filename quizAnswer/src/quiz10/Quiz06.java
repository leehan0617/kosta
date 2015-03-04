package quiz10;

import java.util.Scanner;
import java.util.Vector;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Float> vec=new Vector<Float>();
		float max=0;
		
		for(int i=0;i<5;i++){
			System.out.print((i+1) + "번째 수를 입력하세요:");
			float su=sc.nextFloat();
			vec.add(su);
		}
		System.out.println();
		
		for(int i=0;i<vec.size();i++){
			if(vec.get(i) > max){
				max=vec.get(i);
			}
		}
		
		System.out.println("가장큰수는:" + max);
		sc.close();
	}
}




