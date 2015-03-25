package view03;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;

class MyMouse03 implements MouseMotionListener,MouseWheelListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Use Wheel");
		
	}
	
}

public class Exam27 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		f.addMouseMotionListener(new MyMouse03());
		f.addMouseWheelListener(new MyMouse03());
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
