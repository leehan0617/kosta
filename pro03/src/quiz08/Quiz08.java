package quiz08;

import java.util.ArrayList;

public class Quiz08 {
	public static void main(String[] args) {
		ArrayList<Sung> list=new ArrayList<Sung>();
		Sung a=new Sung("È«±æµ¿",10,20,30);
		Sung b=new Sung("±è±æµ¿",30,40,50);
		Sung c=new Sung("ÀÌ±æµ¿",50,60,70);
		list.add(a);
		list.add(b);
		list.add(c);
		
		Sung.title();
		for(int i=0;i<list.size();i++){
			Sung temp=list.get(i);
			temp.total();
			temp.average();
			temp.disp();
		}
	}
}
