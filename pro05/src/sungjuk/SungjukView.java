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
					break;
				case 2:
					sjd.printSingleSungjuk();
					break;
				case 3:
					sjd.totalScoreAndAvg();
					break;
				case 4:
					sjd.printAllSungjuk();
					break;
				case 5:
					sjd.bestWorstPrint();
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
