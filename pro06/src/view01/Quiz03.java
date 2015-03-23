package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Quiz03View extends JFrame{
	private static final long serialVersionUID = 1L;

	public Quiz03View(){
		super.setTitle("예제입니다.");
		init();
	}
	
	public void init(){
		super.setSize(400,100);
		
		Container con=super.getContentPane();
		con.setLayout(new FlowLayout());
		
		JLabel text1=new JLabel("APPLE");
		JLabel text2=new JLabel("안녕하세요~~~");
		JLabel text3=new JLabel("반가워요!!!!");
		JLabel text4=new JLabel("BANANA");
		
		con.add(text1);
		con.add(text2);
		con.add(text3);			
		con.add(text4);
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Quiz03thread qth=new Quiz03thread(text1);
		Quiz03thread qth2=new Quiz03thread(text4);
		qth.start();
		qth2.start();
	}
}

class Quiz03thread extends Thread{
	private JLabel text;
	
	public Quiz03thread(JLabel text){
		this.text=text;
	}
	
	public void run(){
		int count=0;
		text.setOpaque(true);
		
		while(true){
			try{
				if(count%2==0){
					text.setBackground(Color.YELLOW);
				}else{
					text.setBackground(Color.RED);
				}
				count++;
			super.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}	
	}	
}

public class Quiz03 {
	public static void main(String[] args) {
		new Quiz03View();
	}
}
