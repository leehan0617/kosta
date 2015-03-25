package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class MyItemEvent02 implements ActionListener{
	private JCheckBox[] fruits;
	private JRadioButton[] btns;
	private JButton btn;
	
	public MyItemEvent02(JButton btn,JCheckBox[] fruits,JRadioButton[] btns){
		this.fruits=fruits;
		this.btns=btns;
		this.btn=btn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fruitStr="";
		String btnStr="";
		
		if(e.getSource()==btn){
			for(int i=0;i<fruits.length;i++){
				if(fruits[i].isSelected()==true){
					fruitStr+=fruits[i].getText()+",";
				}
			}
			for(int i=0;i<btns.length;i++){
				if(btns[i].isSelected()==true){
					btnStr=btns[i].getText();
				}
			}
			
			System.out.println(fruitStr+"\t"+btnStr);
		}
	}
}

public class Exam32 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(400,400);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//CheckBox
		JLabel quiz1=new JLabel("quiz1");
		JCheckBox[] fruits=new JCheckBox[4];
		fruits[0]=new JCheckBox("apple");
		fruits[1]=new JCheckBox("banana");
		fruits[2]=new JCheckBox("melon");
		fruits[3]=new JCheckBox("grape");
		JButton sendBtn=new JButton("Àü¼Û");
		//RadioButton
		JLabel quiz2=new JLabel("quiz2");
		JRadioButton[] btns=new JRadioButton[4];
		btns[0]=new JRadioButton("1");
		btns[1]=new JRadioButton("2");
		btns[2]=new JRadioButton("3");
		btns[3]=new JRadioButton("4");
		ButtonGroup bg=new ButtonGroup(); 
			
		con.add(quiz1);
		for(int i=0;i<fruits.length;i++){
			con.add(fruits[i]);
		}
		con.add(quiz2);
		for(int i=0;i<btns.length;i++){
			bg.add(btns[i]);
			con.add(btns[i]);
		}
		con.add(sendBtn);
		
		sendBtn.addActionListener(new MyItemEvent02(sendBtn,fruits,btns));
	
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
