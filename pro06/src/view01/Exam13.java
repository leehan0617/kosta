package view01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exam13 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		
		Container con=frame.getContentPane();
		con.setLayout(new BorderLayout());
		
		//Center
		JPanel p1=new JPanel();
		p1.setBackground(Color.PINK);
	
		//South
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,2,5,5));
		JLabel label2=new JLabel("APPLE");
		label2.setOpaque(true);
		label2.setBackground(Color.BLACK);
		p2.add(label2);
		
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(2,1,5,5));
		JLabel label3=new JLabel("BANANA");
		label3.setOpaque(true);
		label3.setBackground(Color.WHITE);
		p3.add(label3);
		p2.add(p3);
		
		JPanel p4=new JPanel();
		JLabel label4=new JLabel("Melon");
		label4.setOpaque(true);
		label4.setBackground(Color.RED);
		p4.add(label4);
		p3.add(p4);
		
		con.add(p1,BorderLayout.CENTER);
		con.add(p2, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
