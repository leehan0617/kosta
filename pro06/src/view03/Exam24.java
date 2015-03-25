package view03;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

class EventHandler02 implements WindowFocusListener{

	@Override
	public void windowGainedFocus(WindowEvent e) {
		//���Ž� �������
		System.out.println("��Ŀ������"+e.getComponent().getName());
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		//��Ŀ�� �о�����
		System.out.println("��Ŀ������"+e.getComponent().getName());
	}
	
}
public class Exam24 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		f.addWindowFocusListener(new EventHandler02());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame r=new JFrame();
		r.setSize(200,200);
		r.setLocation(600,600);
		
		Container con=r.getContentPane();
		con.setBackground(Color.BLUE);
		
		r.addWindowFocusListener(new EventHandler02());
		
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
