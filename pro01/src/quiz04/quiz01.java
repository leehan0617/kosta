package quiz04;

public class quiz01 {
	public static void main(String[] args) {
		outAtoZ();
		out1to10();
		sum1to10();
	}

	private static void outAtoZ() {
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
		}
		System.out.println();
	}

	private static void out1to10() {
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.print(i);
		}
		System.out.println();
	}

	private static void sum1to10() {
		System.out.println();
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("1부터 10까지의합:"+sum);
	}

}
