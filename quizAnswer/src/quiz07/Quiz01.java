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
			System.out.println("학번:" + hankNum);
			System.out.println("학과:" + major);
			System.out.println("이름:" + name);
			System.out.println("전화번호:" + phone);
			System.out.println("주소:" + addr);
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
			System.out.println("학번:" + hankNum);
			System.out.println("학과:" + major);
			System.out.println("이름:" + name);
			System.out.println("총점:" + tot);
			System.out.println("평균:" + avg);
			System.out.println();
		}
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		MySchool school=new MySchool();
		school.setPerson("12345", "경영학과", "홍길동");    			 // 학번, 학과, 이름
		
		MySchool.MyAddress addr=school.new MyAddress();
		addr.setAddr("010-123-1234", "서울시 강남구 역삼1동");     // 전화번호, 주소
		addr.disp();
		
		
		MySchool.MySungjuk sung=school.new MySungjuk();
		sung.setSungjuk(77, 88, 99);											// 국어, 영어, 수학
		sung.hakjum();
		sung.disp();
	}
}
