package ch09;

public class Exam97 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0;i<args.length;i++){
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println("sum:" + sum);
		
		int num=10;
		Integer objNumber=20;
		//int c=objNumber.intValue(); int result = num+c;
		int result=num+objNumber;
		System.out.println("result:" + result);
		
		int a=10;
		Integer b=new Integer(20);
		int c=b.intValue();
		int d=a+c;
		Integer x=new Integer(10);
		Integer y=new Integer(20);
		int z=x+y;
		System.out.println("d:"+d+"z:"+z);
		
		int su=80;
		Integer value=new Integer(77);
		int hap=su+value;
		System.out.println("hap:"+hap);
		//autoBoxing �ڽ� �ִ´�. Integer a=new Integer(10);
		//unBoxing �ڽ����� ������.int b=a.intValue();
		//�Ѵ� �����Ϸ� �Ǵ��Ͽ� �Ѵ�.
	}
}
