package ch02;

public class Exam19 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		for(int i=2;i<10;i++){
			System.out.print(i+"��\t");
		}
		System.out.println();
		
		for(int i=1;i<10;i++){
			for(int j=2;j<10;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
		

}
