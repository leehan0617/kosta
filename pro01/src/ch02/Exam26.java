package ch02;

public class Exam26 {
	public static void main(String[] args) {
		int x=1;
		int y=0;
		while(x<10){
			if(x==5)
				break;
			System.out.print(x);
			x++;
		}
		System.out.println();
		
		while(y<=10){
			y++;
			if(y==5)
				continue;
			System.out.print(y);
		}
		System.out.println();
		y=0;
		do{
			y++;
			System.out.print(y);
			if(y==5)
				continue;
		}while(y<10);
		
		
	}

}
