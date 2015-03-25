package view02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exam17_1 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("회원가입폼");
		frame.setSize(500,200);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(3,1));
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout());
		
		JLabel labelId=new JLabel("아이디");
		panel1.add(labelId);
		JTextField textId=new JTextField(30);
		panel1.add(textId);
		
		JPanel panel2=new JPanel();
		panel1.setLayout(new FlowLayout());
		
		JLabel labelPwd=new JLabel("패스워드");
		panel2.add(labelPwd);
		JTextField textPwd=new JTextField(30);
		panel2.add(textPwd);
		
		JPanel panel3=new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btnLogin=new JButton("로그인");
		JButton btnCancel=new JButton("취소");
		
		panel3.add(btnLogin);
		panel3.add(btnCancel);
		
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame2=new JFrame();
		frame2.setSize(400, 200);
		
		Container con2=frame2.getContentPane();
		con2.setLayout(new BorderLayout());
		
		JPanel panelNorth=new JPanel();
		panelNorth.setLayout(new BorderLayout());
		JLabel label21=new JLabel("아이디");
		panelNorth.add(label21, BorderLayout.WEST);
		JTextField tf=new JTextField();
		panelNorth.add(tf,BorderLayout.CENTER);
		
		JPanel panelCenter=new JPanel();
		panelCenter.setLayout(new BorderLayout());
		JLabel label22=new JLabel("비번");
		panelCenter.add(label22,BorderLayout.WEST);
		JPasswordField pwdf=new JPasswordField();
		panelCenter.add(pwdf,BorderLayout.CENTER);
		
		con2.add(panelNorth,BorderLayout.NORTH);
		con2.add(panelCenter, BorderLayout.CENTER);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
