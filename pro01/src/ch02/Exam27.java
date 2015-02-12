package ch02;

public class Exam27 {
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				if(j==3)
					break;
				System.out.print(i+"\t"+j);
			}
		}
		
		AA: for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				if(j==3)
					continue AA;
				System.out.println(i+"\t"+j);
			}
		}
		System.out.println();
	}

}
