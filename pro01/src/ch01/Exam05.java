package ch01;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=88;
		int eng=94;
		int mat=87;
		int tot=kor+eng+mat;
		float avg=(float)tot/3;
		System.out.println(avg);
		
		//�ݿø�
		double result1=(int) (avg*10+0.5)/10.0;
		double result2=(int) (avg*100+0.5)/100.0;
		double result3=(int) (avg*1000+0.5)/1000.0;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
