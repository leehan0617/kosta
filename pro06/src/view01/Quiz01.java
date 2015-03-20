package view01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public MyFrame(){
		super.setTitle("øπ¡¶¿‘¥œ¥Ÿ");
	}
	
	public void init(){
		super.setSize(300,150);
		Container con=super.getContentPane();
		con.setLayout(new FlowLayout());
		
		JLabel label=new JLabel();
		label.setFont(new Font("∏º¿∫∞ÌµÒ",Font.BOLD,80));
		con.add(label);
		
		MyThread th=new MyThread(label);
		th.start();
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class MyThread extends Thread{
	private JLabel label;
	
	public MyThread(JLabel label){
		this.label=label;
	}
	
	public void run(){
		int cnt=1;
		
		while(true){
			try{
				label.setText(Integer.toString(cnt));
				cnt++;
			super.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			if(cnt==20) break;
		}
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		f.init();
	}
}
