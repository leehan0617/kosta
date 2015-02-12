package quiz02;

/*
 * 0.01 ~ 1 까지 0.01씩 증가하여 연속적인 수를 더하는 프로그램을 작성하세요.
	[출력화면]
	sum:50.499985
*/
public class quiz12 {
	public static void main(String[] args) {
		double sum=0;
		
		for(double i=0.01;i<=1;i=i+0.01){
			sum += i;
		}
		System.out.println("sum:"+sum);
	}
}
