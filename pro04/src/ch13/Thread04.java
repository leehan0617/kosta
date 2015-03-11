package ch13;

class AA{
	public void disp(){
		System.out.println("hahaha");
	}
}

class Alphabet02 extends AA implements Runnable{
	@Override
	public void run(){
		super.disp();
		
		for(char i='A';i<='Z';i++){
			System.out.println(i);
			
			try{
				Thread.sleep(1000);  //Thread는 lang패키지라 상속안해도 사용가능
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Digit02 extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
			
			try{
				super.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Thread04 {
	public static void main(String[] args) {
		Alphabet02 a=new Alphabet02();
		Thread th=new Thread(a);
		Digit02 d=new Digit02();
		
		th.start();
		d.start();
	}
}
