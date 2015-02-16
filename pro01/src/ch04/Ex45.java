package ch04;

public class Ex45 {
	public static void main(String[] args) {
		int[] a=new int[] {10,20,30,40,50}; //20byte
		//a배열명은 : 배열의 정보를 가지고 있다. (byte)
		sub1(a);
		
		String[] b=new String[] {"kim","park","lee"};
		sub2(b);
		
		int[] c=sub3();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"\t");
		}
		System.out.println();
	}
	
	// a[0]=b[0] ,a[1]=b[1] ... 
	public static void sub1(int[] b){
		for (int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
	}
	public static void sub2(String[] b){
		for (int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
	}
	public static int[] sub3(){
		int[] c=new int[] {55,66,77};
		return c;
	}

}
