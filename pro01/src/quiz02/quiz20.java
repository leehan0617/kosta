package quiz02;

/*
 * 10���� 20������ ���� ���Ͽ� ȭ��� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
(for��, while��, do-while���� �̿��Ͽ� 3���� ���α׷� �Ͻÿ�.)

 */
public class quiz20 {
	public static void main(String[] args) {
		int forSum=0,whileSum=0,doWhileSum=0;
		for(int i=10;i<=20;i++){
			forSum +=i;
		}
		System.out.println("for�� sum="+forSum);
		
		int i=10;
		while(i<=20){
			whileSum += i;
			i ++;
		}
		System.out.println("while�� sum="+whileSum);
		
		int j=10;
		do{
			doWhileSum += j;
			j++;
		}while(j<=20);
		System.out.println("doWhile�� sum="+doWhileSum);
	}

}