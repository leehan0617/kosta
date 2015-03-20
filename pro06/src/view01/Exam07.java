package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

//��ġ������:FlowLayout ���� �߾Ӻ��� ������� ��ġ
public class Exam07 {
	public static void main(String[] args) {
		JFrame f=new JFrame("8��° �����Դϴ�.");
		f.setSize(400,400);
		
		Dimension fdim=f.getSize();
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension tdim=tk.getScreenSize();
		int x=(int)(tdim.getWidth()-fdim.getWidth())/2;
		int y=(int)(tdim.getHeight()-fdim.getHeight())/2;
		f.setLocation(x, y);
		
		Container con=f.getContentPane();
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		con.setLayout(fl);
		
		JLabel a=new JLabel("1.�����Դϴ�.");
		JLabel b=new JLabel("2.�����Դϴ�.");
		JLabel c=new JLabel("3.�����Դϴ�.");
		JLabel d=new JLabel("4.�����Դϴ�.");
		JLabel e=new JLabel("5.�����Դϴ�.");
		
		e.setForeground(Color.RED);
		e.setBackground(Color.YELLOW);
		e.setOpaque(true); //������� 
		e.setFont(new Font("�������",Font.BOLD,20));
		
		con.add(a);
		con.add(b);
		con.add(c);
		con.add(d);
		con.add(e);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
