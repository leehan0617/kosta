package view02;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Exam18 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400,400);
		
		Container con=frame.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel quiz1=new JLabel("1.당신의 관심사는");
		JCheckBox news=new JCheckBox("뉴스");
		JCheckBox sports=new JCheckBox("스포츠");
		JCheckBox movies=new JCheckBox("영화");
		JCheckBox music=new JCheckBox("음악");
		
		con.add(quiz1);
		con.add(news);
		con.add(sports);
		con.add(movies);
		con.add(music);
		
		JLabel quiz2=new JLabel("2.얼마나 자주 극장을 가십니까?");
		JRadioButton movie1=new JRadioButton("한달에 한번갑니다.");
		JRadioButton movie2=new JRadioButton("한달에 두번갑니다.");
		JRadioButton movie3=new JRadioButton("한달에 세번갑니다.");
		JRadioButton movie4=new JRadioButton("한달에 네번갑니다.");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(movie1);
		bg.add(movie2);
		bg.add(movie3);
		bg.add(movie4);
		
		con.add(quiz2);
		con.add(movie1);
		con.add(movie2);
		con.add(movie3);
		con.add(movie4);
		
		JLabel quiz3=new JLabel("3.하루에 얼마나 컴퓨터를 사용하십니까?");
		JRadioButton computer1=new JRadioButton("5시간이하");
		JRadioButton computer2=new JRadioButton("10시간이하");
		JRadioButton computer3=new JRadioButton("15시간이하");
		
		con.add(quiz3);
		con.add(computer1);
		con.add(computer2);
		con.add(computer3);
		
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(computer1);
		bg2.add(computer2);
		bg2.add(computer3);
		
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
