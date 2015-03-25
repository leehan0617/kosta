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
		mainPanel=new JPanel();
		
		JPanel first=new JPanel();
		first.setBackground(Color.BLUE);
		JButton firstBtn=new JButton("firstBtn");
		
		firstBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1=(CardLayout)mainPanel.getLayout();
				c1.show(mainPanel, "마지막");
				System.out.println("firstBtn test");
			}
		});
		
		first.add(firstBtn);
		
		JPanel second=new JPanel();
		second.setBackground(Color.YELLOW);
		JButton secondBtn=new JButton("secondBtn");
		
		secondBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				System.out.println("secondBtn test");
				CardLayout c1=(CardLayout)mainPanel.getLayout();
				c1.show(mainPanel,"처음");
			}
		});
		second.add(secondBtn);
		
		mainPanel.setLayout(new CardLayout());
		mainPanel.add(first,"처음");
		mainPanel.add(second,"마지막");
	}
}
public class TestCard {
	public static void main(String[] args) {
		new CardT();
	}	
}

