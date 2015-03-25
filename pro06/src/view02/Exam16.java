package view02;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exam16 {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame();
		frame.setSize(500,400);
		
		Container con=frame.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
		
		JLabel titleId=new JLabel("ID",JLabel.CENTER);
		titleId.setPreferredSize(new Dimension(50,50));
		
		JTextField textField=new JTextField(10);
//		textField.setText("Input ID.");
		textField.setPreferredSize(new Dimension(100,30));
		
		JLabel labelPwd=new JLabel("Password",JLabel.RIGHT);
		labelPwd.setPreferredSize(new Dimension(80,30));
		
		JPasswordField pwd=new JPasswordField(14);
		pwd.setEchoChar('*');
		pwd.setPreferredSize(new Dimension(100,30));
		
		con.add(titleId);
		con.add(textField);
		con.add(labelPwd);
		con.add(pwd);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread.sleep(5000);
		System.out.println(textField.getText()+"\t"+pwd.getText());
	}
}
