package ch13;

class Digit03 extends Thread{
	public void run(){
		int i=0;
		while(i<=50){
			System.out.print(i);
			
			try{
				super.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			if(i%10==0 && i!=0){
				System.out.println();
			}
			
			i++;
		}
	}
}

class Alphabet03 extends Thread{
	
	public void run(){
		char i='A';
		
		while(i<='Z'){
			System.out.print(i);
			
			try{
				super.sleep(1000);
//				super.join(5000); //다른 스레드가 선점한다.
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			i++;
		}
	}
}

public class Thread05 {
	public static void main(String[] args) {
		Alphabet03 a=new Alphabet03();
		Digit03 d=new Digit03();
		System.out.println("Main Start");
		
		a.setDaemon(true); //종속 스레드로 변한다.(메인이 끝나면 스레드도 끝남)
		d.setDaemon(true);
		a.start();
		d.start();
		
		for(int i=65;i<=70;i++){
			System.out.print("*");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("Main End");
	}
}
