package view01;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Exam04 {
	public static void main(String[] args) {
		JFrame f=new JFrame("5��° �����Դϴ�.");
		f.setSize(300, 200);
		
//		Dimension frameSize=f.getSize();
//		double frameWidth=frameSize.getWidth();
//		double frameHeight=frameSize.getHeight();
		
		//���� ����� ������
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension tDim=tk.getScreenSize();
		System.out.println(tDim.getWidth());
		System.out.println(tDim.getHeight());
		
		int x=(int)(tDim.getWidth()-f.getSize().getWidth())/2;
		int y=(int)(tDim.getHeight()-f.getSize().getHeight())/2;
		
		f.setLocation(x, y);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}