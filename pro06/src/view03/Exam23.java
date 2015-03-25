package view03;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class EventHandler01 implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		//�����찡 Ȱ��ȭ �Ǿ�����
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		//�����찡 ������(dispose�� ȣ��) �ý��ۿ��� ȣ��
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//�ݱ��ư:������ ȭ���� ������
		JOptionPane.showMessageDialog(e.getComponent(), "�����츦 �����մϴ�.","����",JOptionPane.INFORMATION_MESSAGE);
		e.getWindow().dispose();     //�޸�����
		System.exit(0);				 //���α׷����� ����
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		//������ ��Ȱ��ȭ
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		//�ּ�ȭ���¿��� �ٽ� ���� ũ��� �Ǿ�����
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		//�ּ�ȭ ��ư
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		//�����찡 ��������
		System.out.println("windowOpend");
	}
	
}

public class Exam23 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.addWindowListener(new EventHandler01());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
