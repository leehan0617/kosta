package view01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Exam10 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(300,200);
		
		Container con=f.getContentPane();
		GridLayout layout=new GridLayout(2,2,5,5);
		con.setLayout(layout);
		
		JToggleButton btn1=new JToggleButton("1",true);
		JToggleButton btn2=new JToggleButton("2");
		JToggleButton btn3=new JToggleButton("3");
		JToggleButton btn4=new JToggleButton("4");
		
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		con.add(btn4);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
