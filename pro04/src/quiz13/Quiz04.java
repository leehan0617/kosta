package quiz13;
/*
 *    1) 공유데이터 : 프린터
    2) 스레드:  PC(사용자)
    3) 임계영역 : synchronized

    결과) 	첫번째 컴퓨터프린터1번째 사용
	셋번째 컴퓨터프린터2번째 사용
	두번째 컴퓨터프린터3번째 사용
	셋번째 컴퓨터프린터4번째 사용
	첫번째 컴퓨터프린터5번째 사용
	두번째 컴퓨터프린터6번째 사용
	셋번째 컴퓨터프린터7번째 사용
	첫번째 컴퓨터프린터8번째 사용
	두번째 컴퓨터프린터9번째 사용

 */
class Printer{
	private static int counter=0;
	
	public int usePrint(){
		counter++;
		return counter;
	}
}

class PC extends Thread{
	private Printer printer;
	private String name;
	
	public PC(Printer printer,String name){
		this.printer=printer;
		this.name=name;
	}
	
	public synchronized void run(){
		for(int i=0;i<3;i++){
			try{
				System.out.println(name+" 컴퓨터프린터"+printer.usePrint()+"사용");
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Quiz04 {
	public static void main(String[] args) {
		Printer printer=new Printer();

		PC a=new PC(printer, "첫번째 컴퓨터");
		PC b=new PC(printer, "두번째 컴퓨터");
		PC c=new PC(printer, "셋번째 컴퓨터");
	
		a.start();
		b.start();
		c.start();
	}
}