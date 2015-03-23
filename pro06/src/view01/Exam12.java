package view01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
				
public class Exam12 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400,400);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(2,2,10,10));
		
		//Panel 1/1
		JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
	
		JButton btn1=new JButton("1");
		btn1.setBackground(Color.YELLOW);
		
		JButton btn2=new JButton("2");
		btn2.setBackground(Color.RED);
		btn2.setPreferredSize(new Dimension(100,100)); //사이즈 고정
		
		p1.add(btn1);
		p1.add(btn2);
		con.add(p1);
		
		//panel 1/2
		JPanel p2=new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(new JButton("3"),BorderLayout.CENTER);
		p2.add(new JButton("4"),BorderLayout.WEST);
		
		con.add(p2);
		
		//panel 2/1
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(1,2,10,10));
		p3.add(new JLabel("APPLE",JLabel.CENTER));
		
		con.add(p3);
		
		//panel 2/2
		JPanel p4=new JPanel();
		p4.setLayout(new GridLayout(2,2));
		p4.add(new JButton("ONE"));
		p4.add(new JButton("TWO"));
		p4.add(new JButton("THREE"));
		p4.add(new JButton("FOUR"));
		
		con.add(p4);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
