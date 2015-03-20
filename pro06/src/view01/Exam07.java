package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

//배치관리자:FlowLayout 위쪽 중앙부터 순서대로 배치
public class Exam07 {
	public static void main(String[] args) {
		JFrame f=new JFrame("8번째 예제입니다.");
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
		
		JLabel a=new JLabel("1.연습입니다.");
		JLabel b=new JLabel("2.연습입니다.");
		JLabel c=new JLabel("3.연습입니다.");
		JLabel d=new JLabel("4.연습입니다.");
		JLabel e=new JLabel("5.연습입니다.");
		
		e.setForeground(Color.RED);
		e.setBackground(Color.YELLOW);
		e.setOpaque(true); //배경투명도 
		e.setFont(new Font("맑은고딕",Font.BOLD,20));
		
		con.add(a);
		con.add(b);
		con.add(c);
		con.add(d);
		con.add(e);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
