package ch13;

//ȭ��� ����ȭ
//���������ʹ� ȭ���,������� ����, 
//�Ӱ迵�� �ѹ��� �ϳ��� �����常 �����Ҽ� �ִ� �۾�

class Toliet{
	public synchronized void openDoor(String member){ //�޼ҵ� ����ȭ(�޼ҵ� ��ü)
//		synchronized (this) { //��������ȭ (Ư���κ� ����ȭ)
//			
//		}
		System.out.println(member+"����");
		
		for(int i=0;i<100000;i++){
			if(i==100) System.out.println(member+"����");
		}
		
		System.out.println(member+":�� �ÿ���" + "\n");
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
		Family father=new Family(toliet,"�ƺ�");
		Family mother=new Family(toliet,"����");
		Family brother=new Family(toliet,"��");
		Family me=new Family(toliet,"��");
		
		father.start();
		mother.start();
		brother.start();
		me.start();
	}
}