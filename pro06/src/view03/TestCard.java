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
		mainPanel=new JPanel(); //부모패널
		
		JPanel first=new JPanel(); //자식패널1
		first.setBackground(Color.BLUE);
		JButton firstBtn=new JButton("firstBtn");
		
		firstBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1=(CardLayout)mainPanel.getLayout();
				c1.show(mainPanel, "두번째");
				
				System.out.println("firstBtn test");
			}
		});
		
		first.add(firstBtn);
		
		JPanel second=new JPanel(); //자식패널2
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
		mainPanel.add(second,"두번째");
	}
}
public class TestCard {
	public static void main(String[] args) {
		new CardT();
	}	
}

