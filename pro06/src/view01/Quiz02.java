package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz02 {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(400, 400);
		JButton[] btn=new JButton[12];
		Container con=frame.getContentPane();
		GridLayout layout=new GridLayout(4,3,5,5);
		con.setLayout(layout);
		
		for(int i=0;i<btn.length;i++){
			btn[i]=new JButton(Integer.toString(i+1));
		
			if(i==9){
				btn[i].setText("*");
				btn[i].setForeground(Color.BLUE);
			}
			
			if(i==10){
				btn[i].setText("0");
			}
			
			if(i==11){
				btn[i].setText("#");
				btn[i].setForeground(Color.BLUE);
			}
			
			btn[i].setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
			con.add(btn[i]);
		}
		
		Dimension fdim=frame.getSize();
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension tdim=tk.getScreenSize();
		int x=(int)(tdim.getWidth()-fdim.getWidth())/2;
		int y=(int)(tdim.getHeight()-fdim.getHeight())/2;
		frame.setLocation(x, y);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
