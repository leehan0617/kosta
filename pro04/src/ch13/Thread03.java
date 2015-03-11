package ch13;

import javax.swing.JOptionPane;

class SubThread extends Thread{
	public static boolean inputCheck=false;
	
	public void run(){
		for(int i=10;i>0;i--){
			if(SubThread.inputCheck==true) return;
			System.out.println(i);
			
			try{
				super.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("10�� �ȿ� ���� �Էµ��� �ʾҽ��ϴ�.");
		System.exit(0);
	}
}

class InputThread extends Thread{
	public void run(){
		String input=JOptionPane.showInputDialog("10�� �ȿ� ���� �Է��ϼ���");
		SubThread.inputCheck=true;
		System.out.println(input);
	}
}

public class Thread03 {
	public static void main(String[] args) {
		InputThread it=new InputThread();
		SubThread st=new SubThread();
		
		it.start();
		st.start();
	}
}
