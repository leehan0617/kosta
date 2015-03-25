package view02;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam19 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(300,300);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		
		JComboBox<String> com=new JComboBox<String>();
		com.addItem("Samsung");
		com.addItem("LG");
		com.addItem("Apple");
		com.addItem("HP");
		com.setSelectedIndex(2);
		con.add(com);
		
		String[] fruit=new String[]{"Apple","Melon","Banana","Tomato"};

		JComboBox<String> box=new JComboBox<String>(fruit);
		con.add(box);
		
		JLabel birthLb=new JLabel("생년월일");
		JComboBox<Integer> year=new JComboBox<Integer>();
		
		for(int i=1990;i<2020;i++){
			year.addItem(i);
		}
		year.setSelectedItem(1970);
		
		JComboBox<Integer> month=new JComboBox<Integer>();
		for(int i=1;i<=12;i++){
			month.addItem(i);
		}
		
		JComboBox<Integer> day=new JComboBox<Integer>();
		for(int i=1;i<=31;i++){
			day.addItem(i);
		}
		
		con.add(birthLb);
		con.add(year);
		con.add(month);
		con.add(day);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
