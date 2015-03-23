package view01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz04 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		
		Container con=frame.getContentPane();
		
		con.setLayout(new BorderLayout());
		
		JLabel mainNorth=new JLabel("KOTSA");
		mainNorth.setHorizontalAlignment(JLabel.LEFT);
		mainNorth.setBackground(Color.CYAN);
		mainNorth.setOpaque(true);
		
		con.add(mainNorth,BorderLayout.NORTH);
		
		JPanel mainWest=new JPanel();
		mainWest.setBackground(Color.BLUE);
		mainWest.setOpaque(true);
		mainWest.setLayout(new GridLayout(5,1));
		
		JLabel westFirst=new JLabel("��������",JLabel.CENTER);
		westFirst.setForeground(Color.WHITE);
		JLabel westSecond=new JLabel("����",JLabel.CENTER);
		westSecond.setForeground(Color.WHITE);
		JLabel westThird=new JLabel("�ݳ�",JLabel.CENTER);
		westThird.setForeground(Color.WHITE);
		JLabel westFourth=new JLabel("�ּ�",JLabel.CENTER);
		westFourth.setForeground(Color.WHITE);
		JLabel westFifth=new JLabel("��ȭ��ȣ",JLabel.CENTER);
		westFifth.setForeground(Color.WHITE);
		
		mainWest.add(westFirst);
		mainWest.add(westSecond);
		mainWest.add(westThird);
		mainWest.add(westFourth);
		mainWest.add(westFifth);
		
		con.add(mainWest, BorderLayout.WEST);
		
		JPanel mainCenter=new JPanel();
		mainCenter.setLayout(new BorderLayout());
		
		JButton centerNorth=new JButton("4��");
		JButton centerWest=new JButton("2��");
		JButton centerCenter=new JButton("1��");
		JButton centerEast=new JButton("3��");
		JButton centerSouth=new JButton("5��");
		
		mainCenter.add(centerNorth,BorderLayout.NORTH);
		mainCenter.add(centerWest,BorderLayout.WEST);
		mainCenter.add(centerCenter,BorderLayout.CENTER);
		mainCenter.add(centerEast,BorderLayout.EAST);
		mainCenter.add(centerSouth,BorderLayout.SOUTH);
		
		con.add(mainCenter, BorderLayout.CENTER);
		
		JLabel southLabel=new JLabel("TEL:031-123-1234");
		southLabel.setHorizontalAlignment(JLabel.RIGHT);
		southLabel.setBackground(Color.RED);
		southLabel.setForeground(Color.WHITE);
		southLabel.setOpaque(true);
		
		con.add(southLabel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
