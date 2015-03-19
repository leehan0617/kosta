package sungjuk;

import java.util.Scanner;

import dbUnit.DriverProvider;

public class SungjukView {
	public static void main(String[] args) {
		DriverProvider.getDriver();
		SungjukDao sjd=new SungjukDao();
		Scanner scan=new Scanner(System.in);
		
		while(true){
			sjd.init();
			int input=scan.nextInt();
			switch(input){
				case 1:
					sjd.inputSungjuk();
					System.out.println("test1");
					break;
				case 2:
					sjd.printSingleSungjuk();
					System.out.println("test2");
					break;
				case 3:
					sjd.totalScoreAndAvg();
					System.out.println("test3");
					break;
				case 4:
					sjd.printAllSungjuk();
					System.out.println("test4");
					break;
				case 5:
					sjd.bestWorstPrint();
					System.out.println("test5");
					break;
				case 6:
					System.out.println("종료합니다.");
					if(scan!=null)scan.close();
					System.exit(0);
					break;
				default:
					System.out.println("잘못눌렀습니다.");
					break;
			}
		}
	}
}
