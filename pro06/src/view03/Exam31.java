package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class MyItemEvent implements ActionListener,ItemListener{
	//ItemListener:JCheckBox,JRadioButton,JComboBox,JList
	private JButton btn;
	private JCheckBox checkBox;
	private JRadioButton radioButton;
	private static String cStr="";
	private static String rStr="";
	
	public MyItemEvent(JButton btn) {
		this.btn=btn;
	}
	
	public MyItemEvent(JCheckBox checkBox){
		this.checkBox=checkBox;
	}
	
	public MyItemEvent(JRadioButton radioButton){
		this.radioButton=radioButton;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn){
			System.out.println(cStr);
			System.out.println(rStr);
		}
	}
	
	public void itemStateChanged(ItemEvent e) {	
		if(e.getSource()==checkBox){
			cStr+=checkBox.getText()+",";
		}else if(e.getSource()==radioButton){
			rStr+=radioButton.getText();
		}
	}
	
}

public class Exam31 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(400,400);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//CheckBox
		JLabel quiz1=new JLabel("quiz1");
		JCheckBox apple=new JCheckBox("apple");
		JCheckBox banana=new JCheckBox("banana");
		JCheckBox melon=new JCheckBox("melon");
		JCheckBox grape=new JCheckBox("grape");
		JButton sendBtn=new JButton("전송");
		//RadioButton
		JLabel quiz2=new JLabel("quiz2");
		JRadioButton btn1=new JRadioButton("1");
		JRadioButton btn2=new JRadioButton("2");
		JRadioButton btn3=new JRadioButton("3");
		JRadioButton btn4=new JRadioButton("4");
		JButton radioBtn=new JButton("레디오전송");
		ButtonGroup bg=new ButtonGroup(); 
		
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);
		
		con.add(quiz1);
		con.add(apple);
		con.add(banana);
		con.add(melon);
		con.add(grape);
		con.add(sendBtn);
		con.add(quiz2);
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		con.add(btn4);
		con.add(radioBtn);
		
		sendBtn.addActionListener(new MyItemEvent(sendBtn));
		apple.addItemListener(new MyItemEvent(apple));
		banana.addItemListener(new MyItemEvent(banana));
		melon.addItemListener(new MyItemEvent(melon));
		grape.addItemListener(new MyItemEvent(grape));
		btn1.addItemListener(new MyItemEvent(btn1));
		btn2.addItemListener(new MyItemEvent(btn2));
		btn3.addItemListener(new MyItemEvent(btn3));
		btn4.addItemListener(new MyItemEvent(btn4));
		radioBtn.addActionListener(new MyItemEvent(radioBtn));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
