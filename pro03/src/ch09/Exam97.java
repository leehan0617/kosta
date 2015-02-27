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
		//autoBoxing 박스 넣는다. Integer a=new Integer(10);
		//unBoxing 박스에서 꺼낸다.int b=a.intValue();
		//둘다 컴파일러 판단하에 한다.
	}
}
