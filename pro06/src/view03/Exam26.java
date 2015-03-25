package view03;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyMouse02 implements MouseListener{
	private JLabel a,b;
	
	public MyMouse02(JLabel a,JLabel b){
		this.a=a;
		this.b=b;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		String inStr=a.getText();
		String outStr=b.getText();
		
		System.out.println(inStr+outStr);
		//dao,dto
		a.setText(outStr);
		b.setText(inStr);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exam26 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel inputLb=new JLabel("APPLE");
		inputLb.setForeground(Color.RED);
		
		JLabel outputLb=new JLabel("Melon");
		outputLb.setForeground(Color.BLUE);
		
		JButton btn=new JButton("Àü¼Û");
		
		btn.addMouseListener(new MyMouse02(inputLb,outputLb));
		
		con.add(inputLb);
		con.add(outputLb);
		con.add(btn);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
