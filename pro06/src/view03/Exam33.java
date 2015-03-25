package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

class MyEvent03 implements ActionListener{
	private JButton btn;
	private JComboBox<String> box;
	
	public MyEvent03(JButton btn,JComboBox<String> box){
		this.btn=btn;
		this.box=box;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn){
			String str=(String)box.getSelectedItem();
			System.out.println(str);
		}
	}
	
}

public class Exam33 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500,500);
		
		Container con=f.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		String[] subject=new String[]{"JAVA","JSP","ORACLE","JQUERY","SPRING"};
		
		JComboBox<String> box=new JComboBox<String>(subject);
		
		JButton btn=new JButton("Àü¼Û");
		
		con.add(box);
		con.add(btn);
		
		btn.addActionListener(new MyEvent03(btn,box));
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
