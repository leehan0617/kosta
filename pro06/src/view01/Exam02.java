package view01;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Exam02 {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame();
		frame.setSize(500, 600);
		frame.setTitle("두번째 예제입니다.");
		frame.setVisible(true);
		frame.setLocation(400,100);
		Container fBody=frame.getContentPane();
		fBody.setBackground(Color.PINK);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JFrame frame2=new JFrame("세번째 예제입니다.");
		frame2.setSize(300, 400);
		frame2.setLocation(10,10);
		Container f2Body=frame2.getContentPane();
		f2Body.setBackground(Color.GREEN);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		for(int i=0;i<10;i++){
			Thread.sleep(1000);	
			if(i%2==0){
				frame.requestFocus();
			}else{
				frame2.requestFocus();
			}
		}
	}
}
