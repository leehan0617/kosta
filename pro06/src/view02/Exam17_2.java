package view02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam17_2 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("게시판쓰기");
		frame.setSize(500, 500);
		Container con=frame.getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		JLabel labelName=new JLabel("이름");
		panel1.add(labelName);
		JTextField textName=new JTextField(30);
		panel1.add(textName);
		
		JLabel labelTitle=new JLabel("제목");
		panel1.add(labelTitle);
		JTextField textTitle=new JTextField(30);
		panel1.add(textTitle);
		
		JPanel panel3=new JPanel();
		panel3.setLayout(new FlowLayout());
		JLabel labelContent=new JLabel("내용");
		panel3.add(labelContent);
		JTextArea textArea=new JTextArea();
		textArea.setRows(10);
		textArea.setColumns(40);
		panel3.add(textArea);
		panel3.setBackground(Color.GREEN);

		JPanel panel4=new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btn1=new JButton("등록");
		JButton btn2=new JButton("취소");
		panel4.add(btn1);
		panel4.add(btn2);
		panel4.setBackground(Color.BLACK);
		
		con.add(panel1,BorderLayout.NORTH);
		con.add(panel3,BorderLayout.CENTER);
		con.add(panel4,BorderLayout.SOUTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
