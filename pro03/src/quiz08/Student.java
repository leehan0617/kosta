package quiz08;

public class Student {
	private String name;
	private String dept;
	private String number;
	private float avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String toString(){
		return "�̸�:"+name+"\t"+"�а�:"+dept+"\t"+"�й�"+number+"\t"+"����"+avg;
	}
	
}
