package view03;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

public class Exam29 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(400,400);
		
		JMenuBar mb=new JMenuBar();
		JMenu fileMenu=new JMenu();
		fileMenu.setText("ÆÄÀÏ");
		JMenu newMenu=new JMenu("New");
		JMenuItem newProjectMenu=new JMenuItem("Project");
		JMenuItem newFileMenu=new JMenuItem("File");
		
		newMenu.add(newProjectMenu);
		JSeparator sep=new JSeparator();
		newMenu.add(sep);
		newMenu.add(newFileMenu);
		
		fileMenu.add(newMenu);
		JMenuItem saveMenu=new JMenuItem("Save");
		fileMenu.add(saveMenu);
		
		JMenu editMenu=new JMenu("ÆíÁý");
		JCheckBoxMenuItem checkItem1=new JCheckBoxMenuItem("check1");
		JCheckBoxMenuItem checkItem2=new JCheckBoxMenuItem("check2");
		JCheckBoxMenuItem checkItem3=new JCheckBoxMenuItem("check3");
		editMenu.add(checkItem1);
		editMenu.add(checkItem2);
		editMenu.add(checkItem3);
		ButtonGroup checkBg=new ButtonGroup();
		checkBg.add(checkItem1);
		checkBg.add(checkItem2);
		checkBg.add(checkItem3);
		
		JMenu colorMenu=new JMenu("»ö»ó");
		JRadioButtonMenuItem redBtn=new JRadioButtonMenuItem("»¡°­");
		JRadioButtonMenuItem blueBtn=new JRadioButtonMenuItem("ÆÄ¶û");
		JRadioButtonMenuItem yellowBtn=new JRadioButtonMenuItem("³ë¶û");
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(redBtn);
		bg.add(blueBtn);
		bg.add(yellowBtn);
		
		colorMenu.add(redBtn);
		colorMenu.add(blueBtn);
		colorMenu.add(yellowBtn);
		
		JMenu helpMenu=new JMenu("µµ¿ò¸»");
		
		mb.setBackground(Color.GREEN);
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(colorMenu);
		mb.add(helpMenu);
		
		f.setJMenuBar(mb);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class MyMouse04 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			System.out.println("ok");
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
