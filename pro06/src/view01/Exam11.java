package view01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam11 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400,400);
		
		Container con=frame.getContentPane();
		BorderLayout layout=new BorderLayout();
		con.setLayout(layout);
		
		JLabel a=new JLabel("1.중앙배치(Center)");
		a.setOpaque(true);
		a.setBackground(Color.YELLOW);
		
		JLabel b=new JLabel("2.서쪽배치(West)");
		b.setOpaque(true);
		b.setBackground(Color.GREEN);
		
		JLabel c=new JLabel("3.동쪽배치(East)");
		c.setOpaque(true);
		c.setBackground(Color.BLACK);
		
		JLabel d=new JLabel("4.남쪽배치(South)");
		d.setOpaque(true);
		d.setBackground(Color.BLUE);
		
		JLabel e=new JLabel("5.북쪽배치(North)");
		e.setOpaque(true);
		e.setBackground(Color.RED);
		
		con.add(a,BorderLayout.CENTER); //생략불가
		con.add(b,BorderLayout.WEST);
		con.add(c,BorderLayout.EAST);
		con.add(d,BorderLayout.SOUTH);
		con.add(e,BorderLayout.NORTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}