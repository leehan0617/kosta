package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

class MyAction implements ActionListener{
	private JButton btn;
	private JTextField tf;
	private JMenuItem item;
	
	public MyAction(JButton btn){
		this.btn=btn;
	}
	
	public MyAction(JTextField tf){
		this.tf=tf;
	}
	
	public MyAction(JMenuItem item){
		this.item=item;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn){
			System.out.println(btn.getText());
		}else if(e.getSource()==tf){
			System.out.println(tf.getText());
			tf.setText("");
		}else if(e.getSource()==item){
			System.out.println(item.getText());
		}
	}
	
}

public class Exam30 {
	public static void main(String[] args) {
		//ButtonClick,MenuClick,TextFieldEnter :ActionListener
		JFrame f=new JFrame();
		f.setSize(500,500);
		f.setLocation(200,200);
		
		JMenuBar mb=new JMenuBar();
		f.setJMenuBar(mb);
		
		JMenu paintMenu=new JMenu("Paint");
		JMenuItem paint1=new JMenuItem("red");
		paint1.addActionListener(new MyAction(paint1));
		paintMenu.add(paint1);
		
		mb.add(paintMenu);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn=new JButton("btn");
		btn.addActionListener(new MyAction(btn));
		JTextField tf=new JTextField(15);
		btn.addActionListener(new MyAction(tf));
		
		con.add(btn);
		con.add(tf);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
