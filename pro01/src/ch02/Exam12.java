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
		if(avg >=90)
			System.out.println("수");
		else if(avg >=80)
			System.out.println("우");
		else if(avg >=70)
			System.out.println("미");
		else if(avg >=60)
			System.out.println("양");
		else
			System.out.println("가");
		//----------------------------
		
		int k,e,m;
		k=70;
		
	}

}
