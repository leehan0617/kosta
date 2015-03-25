package view03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class TextChat extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextArea ta;
	private JTextField tf;
	
	public TextChat(String str){
		super.setTitle(str);
		super.setSize(300,400);
		this.inputView();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void inputView(){
		ta=new JTextArea("대화창");
		ta.setEditable(false);
		JScrollPane jRoll=new JScrollPane(ta);
		tf=new JTextField("내용을 입력하세요.");
		tf.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				super.mouseClicked(e);
				tf.setText("");
				ta.setText("");
			}			
		});
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.append(tf.getText() +"\n");
				tf.setText("");
			}
		});
		
		super.add(jRoll,"Center"); //Layout default는 borderlayout
		super.add(tf, "South");
	}
}

public class Exam36 {
	public static void main(String[] args) {
		new TextChat("채팅창");
	}
}
