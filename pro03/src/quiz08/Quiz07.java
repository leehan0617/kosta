package quiz08;

import java.util.ArrayList;

public class Quiz07 {
	public static void main(String[] args) {
		Man man=new Man("ȫ�浿",20,"����");
		Man man2=new Man("��浿",23,"����");
		Man man3=new Man("�̱浿",24,"����");
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
