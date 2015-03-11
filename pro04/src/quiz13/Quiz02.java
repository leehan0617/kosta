package quiz13;
/*
 * 2.  1~10까지의 수를 출력합니다. (단 6초마다 실행)
    결과화면)  1   2    3    4   5    6   7   8   9   10
 */
class PrintNum extends Thread{
	public void run(){
		for(int i=1;i<11;i++){
			try{
				System.out.print(i+"\t");
				Thread.sleep(6000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		PrintNum pn=new PrintNum();
		
		pn.start();
	}
}
