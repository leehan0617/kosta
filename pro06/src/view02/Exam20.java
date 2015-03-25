package view02;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exam20 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(800,800);
		
		f.setVisible(true);
		
		JOptionPane.showMessageDialog(f,"메시지", "타이틀",JOptionPane.INFORMATION_MESSAGE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(f,"메시지", "타이틀",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(f,"메시지", "타이틀",JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"메시지");
		
		int value=JOptionPane.showConfirmDialog(null, "메세지","타이틀",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		System.out.println(value);
		
		String msg=JOptionPane.showInputDialog("이름을 입력하세요");
		System.out.println(msg);
	}
}
