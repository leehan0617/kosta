package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam08 {
	public static void main(String[] args) {
		//GridLayout: ������ ĭ���� ��ü������ ������.
		//new GridLayout(4,3) new GridLayout(4,3,10,10) //gap�� 10������
		JFrame f=new JFrame("9��° �����Դϴ�.");
		f.setSize(300,300);
		Container con=f.getContentPane();
		
		con.setLayout(new GridLayout(2,3));
		JLabel a=new JLabel("test1",JLabel.CENTER);
		JLabel b=new JLabel("test2",JLabel.RIGHT);
		JLabel c=new JLabel("test3");
		JLabel d=new JLabel("test4");
		JLabel e=new JLabel("test5");
		
		a.setBackground(Color.YELLOW);
		a.setOpaque(true);
		a.setForeground(Color.BLUE);
		con.add(a);
		con.add(b);
		con.add(c);
		con.add(d);
		con.add(e);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
