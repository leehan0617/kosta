package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class Exam117 {
	private ArrayList<Integer> list;
	
	public void execute(){
		list=new ArrayList<Integer>();
		
		OUT:for(int i=0;i<6;i++){
			int lottoNum=(int)(Math.random()*45)+1;
			
			//중복값처리
			for(int j=0;j<i;j++){
				if(list.get(j)==lottoNum){
					i--;
					continue OUT;
				}
			}
			list.add(i,lottoNum);
		}
		Collections.sort(list);
	}
	
	public void disp(){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i) + "\t");
		}
	}
	
	public static void main(String[] args) {
		Exam117 lotto=new Exam117();
		lotto.execute();
		lotto.disp();
	}
}
