package view03;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Quiz01Event implements ActionListener{
	private JTextField id,result;
	private JPasswordField pwd;
	private JButton login,cancel;
	
	public Quiz01Event(JTextField id,JPasswordField pwd,JTextField result,JButton login,JButton cancel){
		this.id=id;
		this.pwd=pwd;
		this.result=result;
		this.login=login;
		this.cancel=cancel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login ||e.getSource()==id || e.getSource()==pwd){
			if(id.getText().equals("")){
				result.setText("아이디를 입력하세요");
			}else if(pwd.getText().equals("")){
				result.setText("비번을 입력하세요");
			}else{
				result.setText("아이디:"+id.getText()+"비밀번호:"+pwd.getText());
			}
			id.setText("");
			pwd.setText("");
		}else if(e.getSource()==cancel){
			id.setText("");
			pwd.setText("");
		}
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("회원가입 폼");
		frame.setSize(400, 300);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(4,1));
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new BorderLayout());
		JLabel idLabel=new JLabel("아이디    ");
		JTextField idField=new JTextField(15);
		
		panel1.add(idLabel,BorderLayout.WEST);
		panel1.add(idField,BorderLayout.CENTER);
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new BorderLayout());
		JLabel pwdLabel=new JLabel("비밀번호");
		JPasswordField pwdField=new JPasswordField(15);
		panel2.add(pwdLabel, BorderLayout.WEST);
		panel2.add(pwdField, BorderLayout.CENTER);
		
		JPanel panel3=new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton loginBtn=new JButton("로그인");
		JButton cancelBtn=new JButton("취소");
		
		panel3.add(loginBtn);
		panel3.add(cancelBtn);
		
		JPanel panel4=new JPanel();
		panel4.setLayout(new BorderLayout());
		JTextField resultField=new JTextField();
		panel4.add(resultField);
		
		idField.addActionListener(new Quiz01Event(idField,pwdField,resultField,loginBtn,cancelBtn));
		pwdField.addActionListener(new Quiz01Event(idField,pwdField,resultField,loginBtn,cancelBtn));
		loginBtn.addActionListener(new Quiz01Event(idField,pwdField,resultField,loginBtn,cancelBtn));
		cancelBtn.addActionListener(new Quiz01Event(idField,pwdField,resultField,loginBtn,cancelBtn));
		resultField.addActionListener(new Quiz01Event(idField,pwdField,resultField,loginBtn,cancelBtn));
		
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
