package ch02;

public class Exam12 {
	public static void main(String[] args) {
		String name="홍길동";
		int kor=70;
		int eng=88;
		int mat=99;
		int tot=kor+eng+mat;
		float avg=(float)tot/3;
		
		/* 수 : 100~90
		 * 우 : 89~80
		 * 미 : 79~70
		 * 양 : 69~60
		 * 가 : 60미만
		 */
		String hakjum="";
		if(avg >=90)
			hakjum="수";
		else if(avg >=80)
			hakjum="우";
		else if(avg >=70)
			hakjum="미";
		else if(avg >=60)
			hakjum="양";
		else
			hakjum="가";
		
		if(avg>100){
			System.out.println("평균은 100점 만점입니다.");
		}else{
			System.out.println("이름:"+name);
			System.out.println("평균:"+(int)(avg*10+0.5)/10.0 + " 학점:" + hakjum);
		}
		
		int k=0,e=0,m=0;
		k=88;
		System.out.println(k);
	}

}
