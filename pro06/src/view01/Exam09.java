package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam09 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(400, 400);
		
		Container con=f.getContentPane();
		GridLayout g=new GridLayout(4,4,10,10);
		con.setLayout(g);
		
		JButton a=new JButton("A");
		JButton b=new JButton("B");
		JButton c=new JButton("C");
		JButton d=new JButton("D");
		JButton e=new JButton("E");
		JButton f2=new JButton("F");
		JButton g2=new JButton("G");
		JButton h=new JButton("H");
		
		h.setBackground(Color.YELLOW);
		h.setForeground(Color.RED);
		h.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		h.setHorizontalAlignment(JButton.LEFT);
		h.setVerticalAlignment(JButton.TOP);
		
		con.add(a);
		con.add(b);
		con.add(c);
		con.add(d);
		con.add(e);
		con.add(f2);
		con.add(g2);
		con.add(h);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}