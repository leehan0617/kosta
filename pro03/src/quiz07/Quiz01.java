package quiz07;

/*
 * �й�:12345
�а�:�濵�а�
�̸�:ȫ�浿
��ȭ��ȣ:010-123-1234
�ּ�:����� ������ ����1��

�й�:12345
�а�:�濵�а�
�̸�:ȫ�浿
����:264
���:88.0


 */
class MySchool{
	public String hakbun;
	public String dept;
	public String name;
	
	public void setPerson(String hakbun,String dept,String name){
		this.hakbun=hakbun;
		this.dept=dept;
		this.name=name;
	}
	
	class MyAddress{
		public String phone;
		public String address;
		
		public void setAddr(String phone,String address){
			this.phone=phone;
			this.address=address;
		}
		
		public void disp(){
			System.out.println("�й�:"+hakbun);
			System.out.println("�а�:"+dept);
			System.out.println("�̸�:"+name);
			System.out.println("��ȭ��ȣ:"+phone);
			System.out.println("�ּ�:"+address);
		}
	}
	
	class MySungjuk{
		public int kor;
		public int eng;
		public int mat;
		public int tot;
		public float avg;
		
		public void setSungjuk(int kor,int eng,int mat){
			this.kor=kor;
			this.eng=eng;
			this.mat=mat;
		}
		
		public void hakjum(){
			tot=kor+eng+mat;
			avg=tot/3.0f;
		}
		
		public void disp(){
			System.out.println("�й�:"+hakbun);
			System.out.println("�а�:"+dept);
			System.out.println("�̸�:"+name);
			System.out.println("����:"+tot);
			System.out.println("���:"+avg);
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		MySchool school=new MySchool();
		school.setPerson("12345", "�濵�а�", "ȫ�浿");    	       // �й�, �а�, �̸�
		
		MySchool.MyAddress addr=school.new MyAddress();
		addr.setAddr("010-123-1234", "����� ������ ����1��");     // ��ȭ��ȣ, �ּ�
		addr.disp();
		
		MySchool.MySungjuk sung=school.new MySungjuk();
		sung.setSungjuk(77, 88, 99);				// ����, ����, ����
		sung.hakjum();
		sung.disp();
	}
}
