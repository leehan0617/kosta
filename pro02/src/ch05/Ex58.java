package ch05;

class Saram{
	private String name;
	private String address;
	private String phoneNumber;
	private String juminBunho;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getJuminBunho() {
		return juminBunho;
	}
	public void setJuminBunho(String juminBunho) {
		this.juminBunho = juminBunho;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void disp(){
		System.out.println(name + "\t" + address + "\t" + phoneNumber + "\t" + juminBunho + "\t" + age);
	}
}

public class Ex58 {
	public static void main(String[] args) {
		Saram s=new Saram();
		s.setName("홍길동");
		s.setAddress("서울시 강남구 역삼1동");
		s.setPhoneNumber("010-1234-5678");
		s.setJuminBunho("9000000000000");
		s.setAge(26);
		s.disp();
	}
}
