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
		System.out.println("�й�:"+super.getHakbunho());
		System.out.println("�̸�:"+super.getName());
		System.out.println("�а�:"+super.getMajor());
		System.out.println("��ȭ��ȣ:"+this.getPhone());
		System.out.println("�ּ�:"+this.getAddr());
	}
	
	

}
