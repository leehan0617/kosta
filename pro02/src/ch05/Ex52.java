package ch05;

class Person{
	public String name;  //member variable , instance variable
	public int age;
	public float height;
	
	public void display(){
		System.out.println("name:"+name+" age:"+age+" height:"+height);
	}
}

public class Ex52 {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Kim";
		p.age=23;
		p.height=182.5f;
		p.display();
		
		Person e=new Person();
		e.name="Lee";
		e.age=26;
		e.height=177.5f;
		e.display();
	}

}
