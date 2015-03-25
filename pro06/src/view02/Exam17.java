package view02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam17 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400,200);
		
		Container con=frame.getContentPane();
		
		con.setLayout(new BorderLayout());
		
		JPanel panelN=new JPanel();
		panelN.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel nLabel=new JLabel("ID");
		panelN.add(nLabel);
		JTextField textFieldN=new JTextField(15);
		panelN.add(textFieldN);
		
		JPanel panelC=new JPanel();
		JTextArea textarea=new JTextArea();
		textarea.setRows(5);
		textarea.setColumns(34);
		textarea.setText("메세지를 작성하세요");
		
		JScrollPane scroll=new JScrollPane(textarea);
		panelC.add(scroll);
		
		JPanel panelS=new JPanel();
		panelS.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton button1=new JButton("확인");
		panelS.add(button1);
		JButton button2=new JButton("취소");
		panelS.add(button2);
		
		con.add(panelN,BorderLayout.NORTH);
		con.add(panelC, BorderLayout.CENTER);
		con.add(panelS, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}