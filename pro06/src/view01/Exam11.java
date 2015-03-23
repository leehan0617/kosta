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
		
		JLabel a=new JLabel("1.�߾ӹ�ġ(Center)");
		a.setOpaque(true);
		a.setBackground(Color.YELLOW);
		
		JLabel b=new JLabel("2.���ʹ�ġ(West)");
		b.setOpaque(true);
		b.setBackground(Color.GREEN);
		
		JLabel c=new JLabel("3.���ʹ�ġ(East)");
		c.setOpaque(true);
		c.setBackground(Color.BLACK);
		
		JLabel d=new JLabel("4.���ʹ�ġ(South)");
		d.setOpaque(true);
		d.setBackground(Color.BLUE);
		
		JLabel e=new JLabel("5.���ʹ�ġ(North)");
		e.setOpaque(true);
		e.setBackground(Color.RED);
		
		con.add(a,BorderLayout.CENTER); //�����Ұ�
		con.add(b,BorderLayout.WEST);
		con.add(c,BorderLayout.EAST);
		con.add(d,BorderLayout.SOUTH);
		con.add(e,BorderLayout.NORTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}