package quiz06;

public class StudentAddress extends Student {
	private String phone;
	private String addr;
	
	public StudentAddress(int hakbunho,String name,String major,String phone,String addr){
		super.setHakbunho(hakbunho);
		super.setName(name);
		super.setMajor(major);
		this.phone=phone;
		this.addr=addr;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void disp(){
		System.out.println("학번:"+super.getHakbunho());
		System.out.println("이름:"+super.getName());
		System.out.println("학과:"+super.getMajor());
		System.out.println("전화번호:"+this.getPhone());
		System.out.println("주소:"+this.getAddr());
	}
	
	

}
