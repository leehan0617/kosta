package quiz13;
/*
 * 1. +와 -를 30번씩 출력하는 일을 동시에 하는 멀티 스레드 작성하세요. (출력값은 매번 다를 수 있다.)
    결과화면)   + 	- 	+ 	- 	+ 	- 	+ 	- 	- 	+ 
 */

class Plus extends Thread{
	public void run(){
		for(int i=0;i<30;i++){
			try{
				System.out.print("+ ");
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			if(i%10==0 && i!=0){
				System.out.println();
			}
		}
	}
}

class Minus extends Thread{
	public void run(){
		for(int i=0;i<30;i++){
			try{
				System.out.print("- ");
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			if(i%10==0 && i!=0){
				System.out.println();
			}
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Plus plus=new Plus();
		Minus minus=new Minus();
		
		plus.start();
		minus.start();
	}
}
