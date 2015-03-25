package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyKey01 implements KeyListener,MouseListener{
	private JTextField tf;
	private JButton btn1,btn2;
	
	public MyKey01(JTextField tf,JButton btn1,JButton btn2){
		this.tf=tf;
		this.btn1=btn1;
		this.btn2=btn2;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		//키보드 눌렀을때
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//키보드 떼엇을때
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//키보드 눌렀다 때었을때
		if(e.getSource()==tf){
			System.out.println("keyTyped");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==btn1){
			System.out.println(tf.getText()); //DB
			tf.setText("");
		}else if(e.getSource()==btn2){
			tf.setText("");
		}else if(e.getSource()==tf){
			System.out.println("textfield");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exam28 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JTextField tf=new JTextField(10);
		JButton btn1=new JButton("확인");
		JButton btn2=new JButton("취소");
		
		MyKey01 mk2=new MyKey01(tf,btn1,btn2);
		
		btn1.addMouseListener(mk2);
		btn2.addMouseListener(mk2);
		tf.addKeyListener(mk2);
		tf.addMouseListener(mk2);
		
		con.add(tf);
		con.add(btn1);
		con.add(btn2);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}