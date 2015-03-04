package quiz10;

import java.util.ArrayList;
import java.util.Vector;

class Man{
	private String name;
	private int age;
	private String address;
	
	public Man(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void disp(){
		System.out.println("이름:" +  name);
		System.out.println("나이:" + age);
		System.out.println("주소:" +  address);
		System.out.println();
	}
}

public class Quiz07 {
	public static void main(String[] ar){
		Man a=new Man("홍길동", 25, "서울");
		Man b=new Man("임꺽정", 30, "광주");
		Man c=new Man("이순신", 23, "인천");
		
		ArrayList<Man> list=new ArrayList<Man>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(list);
		System.out.println();
		
		for(int i=0;i<list.size();i++){
			Man result=list.get(i);
			result.disp();
		}
		System.out.println("---------------");
		
		Vector<Man> vec=new Vector<Man>();
		vec.add(a);
		vec.add(b);
		vec.add(c);
		
		for(int i=0;i<vec.size();i++){
			Man result=vec.get(i);
			result.disp();
		}
	}
}

