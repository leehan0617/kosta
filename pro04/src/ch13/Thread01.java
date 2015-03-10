package ch13;

class Alphabet01 extends Thread {       //�ν�����
	public void run(){
		for(char i='A';i<='z';i++){
			System.out.print(i);
			if(i=='Z') System.out.println();
			
			try {
				Thread.sleep(1000); //1000millis =1�� 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Digit01 extends Thread {          //�ν�����
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.print(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread01 {
	public static void main(String[] args) { //�־�����
		Alphabet01 a=new Alphabet01();
		a.start(); //a.run() ���Ͻ������ ����
		
		Digit01 d=new Digit01();
		d.start();
	}
}
