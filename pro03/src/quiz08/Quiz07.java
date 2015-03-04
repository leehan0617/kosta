package quiz08;

import java.util.ArrayList;

public class Quiz07 {
	public static void main(String[] args) {
		Man man=new Man("홍길동",20,"서울");
		Man man2=new Man("김길동",23,"서울");
		Man man3=new Man("이길동",24,"서울");
		ArrayList<Man> list=new ArrayList<Man>();
		list.add(man);
		list.add(man2);
		list.add(man3);
		
		for(int i=0;i<list.size();i++){
			Man temp=list.get(i);
			temp.disp();
			System.out.println();
		}
	
	}
}
