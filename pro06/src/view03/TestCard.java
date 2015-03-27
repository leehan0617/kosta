package view03;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CardT extends JFrame{
	JPanel mainPanel;
	
	public CardT(){
		super.setTitle("CardTest");
		super.setSize(300,300);
		this.cardTest();
		super.add(mainPanel);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void cardTest(){
		mainPanel=new JPanel(); //�θ��г�
		
		JPanel first=new JPanel(); //�ڽ��г�1
		first.setBackground(Color.BLUE);
		JButton firstBtn=new JButton("firstBtn");
		
		firstBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1=(CardLayout)mainPanel.getLayout();
				c1.show(mainPanel, "�ι�°");
				
				System.out.println("firstBtn test");
			}
		});
		
		first.add(firstBtn);
		
		JPanel second=new JPanel(); //�ڽ��г�2
		second.setBackground(Color.YELLOW);
		JButton secondBtn=new JButton("secondBtn");
		
		secondBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				System.out.println("secondBtn test");
				CardLayout c1=(CardLayout)mainPanel.getLayout();
				c1.show(mainPanel,"ó��");
			}
		});
		second.add(secondBtn);
		
		mainPanel.setLayout(new CardLayout());
		mainPanel.add(first,"ó��");
		mainPanel.add(second,"�ι�°");
	}
}
public class TestCard {
	public static void main(String[] args) {
		new CardT();
	}	
}

