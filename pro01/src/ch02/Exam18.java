package ch02;

public class Exam18 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				System.out.println(i+"\t"+j);
			}
			System.out.println();
		}
		
		for(char i='A';i<='Z';i++){
			for(char j=i;j<='Z';j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
