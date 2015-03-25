package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouse01 implements MouseListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//마우스를 눌렀다 때엇을때 mousePressed+mouseReleased
		JFrame f=new JFrame();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스 포인터가 영역으로 들어갔을때
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스 포인터가 영역밖으로 나갈때
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
}

public class Exam25 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn=new JButton("btn");
		btn.addMouseListener(new MyMouse01());
		
		con.add(btn);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
