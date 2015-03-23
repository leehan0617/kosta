package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam14 {
	public static void main(String[] args) {
		JFrame r=new JFrame();
		r.setSize(400,400);
		r.setLocation(400, 200);
		
		Container con=r.getContentPane();
		con.setLayout(null);
		
		JButton b=new JButton("apple");
		b.setSize(100,50);
		b.setLocation(10,10);
		con.add(b);
		
		JLabel d=new JLabel("test");
		d.setSize(new Dimension(50,50));
		d.setLocation(120,10);
		d.setBackground(Color.RED);
		d.setOpaque(true);
		con.add(d);
		
		JButton c=new JButton("banana");
		c.setBounds(260, 10, 100, 50);
		
		con.add(c);
		
		JButton e=new JButton("Melon");
		e.setSize(100,50);
		
		Dimension frameSize=r.getSize();
		Dimension btnSize=e.getSize();
		
		int x=(int)(frameSize.getWidth()-btnSize.getWidth())/2;
		int y=(int)(frameSize.getHeight()-btnSize.getHeight())/2;
		
		e.setLocation(x,y);
		con.add(e);
		
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
