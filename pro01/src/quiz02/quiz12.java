package quiz02;

/*
 * 0.01 ~ 1 ���� 0.01�� �����Ͽ� �������� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
	[���ȭ��]
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
