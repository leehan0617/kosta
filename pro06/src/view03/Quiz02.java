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
import javax.swing.JTextField;

class Quiz02Event implements ActionListener{
	private JTextField firstField,buho,secondField,resultField;
	private JButton checkBtn,cancelBtn;
	
	public Quiz02Event(JTextField firstField,JTextField buho,JTextField secondField,JTextField resultField,JButton checkBtn,JButton cancelBtn){
		this.firstField=firstField;
		this.buho=buho;
		this.secondField=secondField;
		this.resultField=resultField;
		this.checkBtn=checkBtn;
		this.cancelBtn=cancelBtn;
	}
	
	public void setEdit(){
		firstField.setEditable(false);
		buho.setEditable(false);
		secondField.setEditable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==checkBtn || e.getSource()==secondField || e.getSource()==firstField || e.getSource()==buho){
			if(firstField.getText().equals("")){
				resultField.setText("첫번째 수를 입력하세요.");
			}else if(buho.getText().equals("")){
				resultField.setText("부호를 입력하세요");
			}else if(secondField.getText().equals("")){
				resultField.setText("두번째 수를 입력하세요.");
			}else{
				String checkBuho=buho.getText();
				int firstNum=Integer.parseInt(firstField.getText());
				int secondNum=Integer.parseInt(secondField.getText());
				
				setEdit();
				switch(checkBuho){
				case "+":resultField.setText("결과값은:"+Integer.toString(firstNum+secondNum));
						break;
				case "-":resultField.setText("결과값은:"+Integer.toString(firstNum-secondNum));
						break;
				case "*":
						resultField.setText("결과값은:"+Integer.toString(firstNum*secondNum));
						break;
				case "/":
						resultField.setText("결과값은:"+Float.toString((float)firstNum/secondNum));
						break;
				default:resultField.setText("부호는 +,-,*,/만됨");
						buho.setText("");
				}
			}
		}else if(e.getSource()==cancelBtn){
			firstField.setText("");
			buho.setText("");
			secondField.setText("");
			resultField.setText("결과값은:");
			firstField.setEditable(true);
			buho.setEditable(true);
			secondField.setEditable(true);
		}
	}
	
}

public class Quiz02 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("사칙연산");
		frame.setSize(400, 500);
		
		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(5,1));
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new BorderLayout());
		JLabel firstNum=new JLabel("첫번째수");
		JTextField firstField=new JTextField(15);
		panel1.add(firstNum, BorderLayout.WEST);
		panel1.add(firstField, BorderLayout.CENTER);
		
		JPanel panel2=new JPanel();
		panel2.setLayout(new BorderLayout());
		JLabel buhoLabel=new JLabel("부호         ");
		JTextField buhoField=new JTextField(15);
		panel2.add(buhoLabel, BorderLayout.WEST);
		panel2.add(buhoField, BorderLayout.CENTER);
		
		JPanel panel3=new JPanel();
		panel3.setLayout(new BorderLayout());
		JLabel secondNum=new JLabel("두번째수");
		JTextField secondField=new JTextField(15);
		panel3.add(secondNum, BorderLayout.WEST);
		panel3.add(secondField, BorderLayout.CENTER);
		
		JPanel panel4=new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton checkBtn=new JButton("연산");
		JButton cancelBtn=new JButton("취소");
		panel4.add(checkBtn);
		panel4.add(cancelBtn);
		
		JPanel panel5=new JPanel();
		panel5.setLayout(new BorderLayout());
		JTextField resultField=new JTextField();
		panel5.add(resultField);
		
		firstField.addActionListener(new Quiz02Event(firstField,buhoField,secondField,resultField,checkBtn,cancelBtn));
		buhoField.addActionListener(new Quiz02Event(firstField,buhoField,secondField,resultField,checkBtn,cancelBtn));
		secondField.addActionListener(new Quiz02Event(firstField,buhoField,secondField,resultField,checkBtn,cancelBtn));
		resultField.addActionListener(new Quiz02Event(firstField,buhoField,secondField,resultField,checkBtn,cancelBtn));
		checkBtn.addActionListener(new Quiz02Event(firstField,buhoField,secondField,resultField,checkBtn,cancelBtn));
		cancelBtn.addActionListener(new Quiz02Event(firstField,buhoField,secondField,resultField,checkBtn,cancelBtn));
		
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(panel4);
		con.add(panel5);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
