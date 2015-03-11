package ch13;

//화장실 동기화
//공유데이터는 화장실,스레드는 가족, 
//임계영역 한번에 하나의 스레드만 실행할수 있는 작업

class Toliet{
	public synchronized void openDoor(String member){ //메소드 동기화(메소드 전체)
//		synchronized (this) { //지역동기화 (특정부분 동기화)
//			
//		}
		System.out.println(member+"입장");
		
		for(int i=0;i<100000;i++){
			if(i==100) System.out.println(member+"끄응");
		}
		
		System.out.println(member+":아 시원해" + "\n");
	}
}

class Family extends Thread{
	private Toliet toliet;
	private String who;
	
	public Family(Toliet toliet,String who){
		this.toliet=toliet;
		this.who=who;
	}
	
	public void run(){
		toliet.openDoor(who);
	}
}

public class Thread07 {
	public static void main(String[] args) {
		Toliet toliet=new Toliet();
		Family father=new Family(toliet,"아빠");
		Family mother=new Family(toliet,"엄마");
		Family brother=new Family(toliet,"형");
		Family me=new Family(toliet,"나");
		
		father.start();
		mother.start();
		brother.start();
		me.start();
	}
}