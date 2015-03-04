package quiz08;

public class Man {
	private String name;
	private int age;
	private String address;
	
	public Man(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void disp(){
		System.out.println("이름"+getName());
		System.out.println("나이"+getAge());
		System.out.println("주소"+getAddress());
	}
}
