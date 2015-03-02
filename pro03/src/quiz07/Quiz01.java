package quiz07;

/*
 * 학번:12345
학과:경영학과
이름:홍길동
전화번호:010-123-1234
주소:서울시 강남구 역삼1동

학번:12345
학과:경영학과
이름:홍길동
총점:264
평균:88.0


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
			System.out.println("학번:"+hakbun);
			System.out.println("학과:"+dept);
			System.out.println("이름:"+name);
			System.out.println("전화번호:"+phone);
			System.out.println("주소:"+address);
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
			System.out.println("학번:"+hakbun);
			System.out.println("학과:"+dept);
			System.out.println("이름:"+name);
			System.out.println("총점:"+tot);
			System.out.println("평균:"+avg);
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		MySchool school=new MySchool();
		school.setPerson("12345", "경영학과", "홍길동");    	       // 학번, 학과, 이름
		
		MySchool.MyAddress addr=school.new MyAddress();
		addr.setAddr("010-123-1234", "서울시 강남구 역삼1동");     // 전화번호, 주소
		addr.disp();
		
		MySchool.MySungjuk sung=school.new MySungjuk();
		sung.setSungjuk(77, 88, 99);				// 국어, 영어, 수학
		sung.hakjum();
		sung.disp();
	}
}
