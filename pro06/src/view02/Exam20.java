package view02;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exam20 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(800,800);
		
		f.setVisible(true);
		
		JOptionPane.showMessageDialog(f,"�޽���", "Ÿ��Ʋ",JOptionPane.INFORMATION_MESSAGE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(f,"�޽���", "Ÿ��Ʋ",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(f,"�޽���", "Ÿ��Ʋ",JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"�޽���");
		
		int value=JOptionPane.showConfirmDialog(null, "�޼���","Ÿ��Ʋ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		System.out.println(value);
		
		String msg=JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		System.out.println(msg);
	}
}
