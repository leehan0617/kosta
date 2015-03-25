package view03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel quiz1,quiz2,quiz3;
	private JButton submitBtn,resetBtn;
	private JCheckBox[] fruit;
	private JRadioButton[] gender;
	private JComboBox<String> car;
	private ButtonGroup bg;
	
	public MyView(String title){
		super(title);
		super.setSize(320,400);
		this.init();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init(){
		Container con=super.getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		quiz1=new JLabel("당신이 좋아하는 과일은?");
		fruit=new JCheckBox[4];
		fruit[0]=new JCheckBox("Apple");
		fruit[1]=new JCheckBox("Banana");
		fruit[2]=new JCheckBox("Grape");
		fruit[3]=new JCheckBox("Melon");
		
		con.add(quiz1);
		for(int i=0;i<fruit.length;i++){
			con.add(fruit[i]);
		}
		
		quiz2=new JLabel("당신의 성은?");
		gender=new JRadioButton[2];
		gender[0]=new JRadioButton("남");
		gender[1]=new JRadioButton("여");
		bg=new ButtonGroup();
		
		con.add(quiz2);
		for(int i=0;i<gender.length;i++){
			bg.add(gender[i]);
			con.add(gender[i]);
		}
		
		quiz3=new JLabel("당신의 차는?");
		String[] array=new String[]{"SM3","SONATA","K5","WALK"};
		car=new JComboBox<String>(array);
		
		con.add(quiz3);
		con.add(car);
		
		submitBtn=new JButton("전송");
		resetBtn=new JButton("리셋");
		
		con.add(submitBtn);
		con.add(resetBtn);
		
		submitBtn.addActionListener(this);
		resetBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String fruitStr="";
		String genderStr="";
		String carStr="";
		if(e.getSource()==submitBtn){
			for(int i=0;i<fruit.length;i++){
				if(fruit[i].isSelected()==true){
					fruitStr+=fruit[i].getText()+",";
				}
			}
			for(int i=0;i<gender.length;i++){
				if(gender[i].isSelected()==true){
					genderStr=gender[i].getText();
				}
			}
			
			carStr=(String)car.getSelectedItem();
			
			System.out.println("fruit:"+fruitStr);
			System.out.println("gender:"+genderStr);
			System.out.println("car:"+carStr);
		}else if(e.getSource()==resetBtn){
			for(int i=0;i<fruit.length;i++){
				fruit[i].setSelected(false);
			}
			bg.clearSelection();
			car.setSelectedIndex(0);
		}
	}
}
