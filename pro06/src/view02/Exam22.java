package view02;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam22 {
	public static void main(String[] args) {
		//FONT
		JFrame frame=new JFrame("Font Testing");
		frame.setSize(400,250);
		
		Container con=frame.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
	
		JLabel abc1=new JLabel("ABCDEFG");
		JLabel abc2=new JLabel("ABCDEFG");
		JLabel abc3=new JLabel("ABCDEFG");
		JButton abc4=new JButton("ABCDEFG");
		
		abc1.setFont(new Font("¸¼Àº °íµñ",Font.ITALIC,20));
		abc2.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,20));
		abc3.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,12));
		abc4.setFont(new Font("¸¼Àº °íµñ",Font.BOLD+Font.ITALIC,20));
		
		abc1.setOpaque(true);
		abc1.setBackground(Color.RED);
		abc2.setOpaque(true);
		abc2.setBackground(new Color(247,144,144));
		
		con.add(abc1);
		con.add(abc2);
		con.add(abc3);
		con.add(abc4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
