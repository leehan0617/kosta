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
		
		JLabel quiz1=new JLabel("1.����� ���ɻ��");
		JCheckBox news=new JCheckBox("����");
		JCheckBox sports=new JCheckBox("������");
		JCheckBox movies=new JCheckBox("��ȭ");
		JCheckBox music=new JCheckBox("����");
		
		con.add(quiz1);
		con.add(news);
		con.add(sports);
		con.add(movies);
		con.add(music);
		
		JLabel quiz2=new JLabel("2.�󸶳� ���� ������ ���ʴϱ�?");
		JRadioButton movie1=new JRadioButton("�Ѵ޿� �ѹ����ϴ�.");
		JRadioButton movie2=new JRadioButton("�Ѵ޿� �ι����ϴ�.");
		JRadioButton movie3=new JRadioButton("�Ѵ޿� �������ϴ�.");
		JRadioButton movie4=new JRadioButton("�Ѵ޿� �׹����ϴ�.");
		
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
		
		JLabel quiz3=new JLabel("3.�Ϸ翡 �󸶳� ��ǻ�͸� ����Ͻʴϱ�?");
		JRadioButton computer1=new JRadioButton("5�ð�����");
		JRadioButton computer2=new JRadioButton("10�ð�����");
		JRadioButton computer3=new JRadioButton("15�ð�����");
		
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
