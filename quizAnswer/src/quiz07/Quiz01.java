package quiz07;

class MySchool{
	private String hankNum;
	private String major;
	private String name;
	public void setPerson(String hankNum, String major, String name){
		this.major=major;
		this.hankNum=hankNum;
		this.name=name;
	}
	
	class MyAddress{
		private String phone;
		private String addr;
		public void setAddr(String phone, String addr){
			this.phone=phone;
			this.addr=addr;
		}
		public void disp(){
			System.out.println("�й�:" + hankNum);
			System.out.println("�а�:" + major);
			System.out.println("�̸�:" + name);
			System.out.println("��ȭ��ȣ:" + phone);
			System.out.println("�ּ�:" + addr);
			System.out.println();
		}
	}
	
	class MySungjuk{
		private int kor, eng, mat, tot;
		private float avg;
		public void setSungjuk(int kor, int eng, int mat){
			this.kor=kor;
			this.eng=eng;
			this.mat=mat;
		}
		public void hakjum(){
			tot=kor+eng+mat;
			avg=(float) tot/3;
		}
		public void disp(){
			System.out.println("�й�:" + hankNum);
			System.out.println("�а�:" + major);
			System.out.println("�̸�:" + name);
			System.out.println("����:" + tot);
			System.out.println("���:" + avg);
			System.out.println();
		}
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		MySchool school=new MySchool();
		school.setPerson("12345", "�濵�а�", "ȫ�浿");    			 // �й�, �а�, �̸�
		
		MySchool.MyAddress addr=school.new MyAddress();
		addr.setAddr("010-123-1234", "����� ������ ����1��");     // ��ȭ��ȣ, �ּ�
		addr.disp();
		
		
		MySchool.MySungjuk sung=school.new MySungjuk();
		sung.setSungjuk(77, 88, 99);											// ����, ����, ����
		sung.hakjum();
		sung.disp();
	}
}
