package ch02;

public class Exam16 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i%2==0)
				System.out.println("i:"+i);		
		}
		
		int hap=0;
		for(int i=1;i<=10;i++){
			hap+=i;
		}
		System.out.println(hap);
		
		int sum=0;
		for(int i=100;i<=200;i++){
			if(i>150 && i<200) sum+=i;
		}
		System.out.println("sum:"+sum);
		
	}
}
