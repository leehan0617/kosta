package ch13;

class MyThread extends Thread {
	public MyThread(String name){
		super(name);
	}
	
	public void run(){
		int sum=0;
		for(int i=0;i<10;i++){
			sum+=i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(super.getName()+":"+sum);
		}
	}
}

public class Thread02 {
	public static void main(String[] args) {
		MyThread a=new MyThread("1번 쓰레드");
		a.start();
		
		MyThread b=new MyThread("2번 쓰레드");
		b.start();
	}
}
