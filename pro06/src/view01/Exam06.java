package view01;

import javax.swing.JFrame;

class MyJFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MyJFrame(){
		super("Ŭ���� �����Դϴ�.");
		this.init();
	}
	
	public void init(){
		super.setSize(300,400);
		super.setLocation(100, 100);
		super.setResizable(false);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

public class Exam06 {
	public static void main(String[] args) {
		new MyJFrame().init();
	}
}