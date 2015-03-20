package view01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Exam05 {
	public static void main(String[] args) {
		JFrame f=new JFrame("7번째 예제입니다.");
		f.setSize(400,400);
		
		Dimension fdim=f.getSize();
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension tdim=tk.getScreenSize();
		
		int x=(int)(tdim.getWidth()-fdim.getWidth())/2;
		int y=(int)(tdim.getHeight()-fdim.getHeight())/2;
		
		f.setLocation(x,y);
		f.setResizable(true);
		f.requestFocus();
	
		Container con=f.getContentPane();
		con.setBackground(Color.BLACK);
		
		ImageIcon img=new ImageIcon("C:\\JAVA\\workspace\\pro06\\src\\test.jpg");
		f.setIconImage(img.getImage());
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}
