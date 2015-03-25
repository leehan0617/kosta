package view02;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exam15 {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame();
		frame.setSize(400, 400);
		
		Container con=frame.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JTextField tf=new JTextField(15);
		tf.setBackground(Color.PINK);
		tf.setForeground(Color.WHITE);
		
		con.add(tf);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread.sleep(2000);
		tf.setText("hi");
		System.out.println(tf.getText());
		tf.setEditable(false);
	}
}
