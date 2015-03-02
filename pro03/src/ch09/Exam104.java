package ch09;

public class Exam104 {
	public static void main(String[] args) {
		System.out.println("20의 절대값:" + Math.abs(-20));
		System.out.println("최대값:" + Math.max(10,30));
		System.out.println("최소값:" + Math.min(1.5,3.5));
		System.out.println("2의3승:" + (int)Math.pow(2, 3));
		System.out.println();
		
		for(int i=0;i<10;i++){
			double random=Math.random();
			System.out.println("random:" + random);
		}
		System.out.println();
		
		for(int i=0;i<10;i++){
			int random=(int)(Math.random()*10);
			System.out.println("random:" + random);
		}
		
		String[] array=new String[]{"a","b","c","d"};
		
		int random=(int)(Math.random()*array.length);
		System.out.println("random:" + array[random]);
	}

}
