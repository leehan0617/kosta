package quiz13;
/*
 * 1. +�� -�� 30���� ����ϴ� ���� ���ÿ� �ϴ� ��Ƽ ������ �ۼ��ϼ���. (��°��� �Ź� �ٸ� �� �ִ�.)
    ���ȭ��)   + 	- 	+ 	- 	+ 	- 	+ 	- 	- 	+ 
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
