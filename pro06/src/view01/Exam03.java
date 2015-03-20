package view01;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Exam03 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("4번째 예제입니다.");
		frame.setSize(300,300);
		frame.setLocation(400, 200);
		frame.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Dimension ds=frame.getSize(); //가로:300 세로:300
		System.out.println(ds.getHeight()+"\t"+ds.getWidth());
		
		Point p=frame.getLocation();
		System.out.println(p.getX()+"\t"+p.x+"\t"+p.getY()+"\t"+p.y);
		
		JFrame frame2=new JFrame("네번째 예제입니다.");
		frame2.setBounds(10,10,100,300);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Rectangle r=frame2.getBounds();
		System.out.println(r.getWidth()+"\t"+r.getHeight());
		System.out.println(r.getX()+"\t"+r.getY());
	}
}
