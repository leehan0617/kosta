package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyKeyAdapter extends KeyAdapter{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyTyped(e);
	}
	
}

class MyMouseAdapter extends MouseAdapter{

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		System.out.println("test");
	}
	
}

public class Exam35 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout());
		
		JButton btn1=new JButton("btn1");
		btn1.addMouseListener(new MyMouseAdapter());
		
		JButton btn2=new JButton("btn2");
		btn2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				super.mouseClicked(e);
				System.out.println("btn2 test");
			}
		});
		JButton btn3=new JButton("btn3");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("btn3 test");
			}
		});
		
		
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
