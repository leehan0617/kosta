package view01;

import javax.swing.JFrame;

public class Exam01{
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setTitle("첫번째 예제입니다.");
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //자원 반납
	}
}
