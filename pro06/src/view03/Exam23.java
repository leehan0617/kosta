package view03;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class EventHandler01 implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		//윈도우가 활성화 되었을때
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		//윈도우가 닫힐때(dispose가 호출) 시스템에서 호출
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//닫기버튼:윈도우 화면을 닫을때
		JOptionPane.showMessageDialog(e.getComponent(), "윈도우를 종료합니다.","종료",JOptionPane.INFORMATION_MESSAGE);
		e.getWindow().dispose();     //메모리제거
		System.exit(0);				 //프로그램에서 종료
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		//윈도우 비활성화
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		//최소화상태에서 다시 원래 크기로 되었을때
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		//최소화 버튼
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		//윈도우가 열렸을때
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
