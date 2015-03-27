package bankGUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bankModel.AccountDao;
import bankModel.AccountDto;

public class AccountView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JLabel idLb,nameLb,balanceLb,titleLb;
	private JTextField idTf,nameTf,balanceTf;
	private JButton makeBtn,depositBtn,withdrawBtn,inquireBtn,deleteBtn;
	private JTable jTable;
	private DefaultTableModel model;
	
	public AccountView(){
		this.viewInit();
		this.viewEvent();
	}
	
	public void viewInit(){
		super.setTitle("Bank Input,Output");
		super.setSize(600,500);
		
		//ȭ�� �߾ӿ� ���
		Dimension fDim=super.getSize();
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension tDim=tk.getScreenSize();
		int x=(int)(tDim.getWidth()-fDim.getWidth())/2;
		int y=(int)(tDim.getHeight()-fDim.getHeight())/2;
		super.setLocation(x, y);
		
		Container con=super.getContentPane();
		con.setLayout(new BorderLayout());
		
		//����
		JPanel north=new JPanel(new BorderLayout());
		north.setPreferredSize(new Dimension(500,100));
		
		JPanel fl=new JPanel(new FlowLayout()); //default: new FlowLayout(FlowLayout.CENTER);
		fl.setPreferredSize(new Dimension(500,60));
		titleLb=new JLabel("KOSTA ���� ����",JLabel.CENTER);
		titleLb.setFont(new Font("���� ���",Font.BOLD,20));
		fl.add(titleLb);
		north.add(fl,BorderLayout.NORTH);
		
		JPanel gl=new JPanel(new GridLayout(1,6,3,3));
		gl.setPreferredSize(new Dimension(500,40));
		idLb=new JLabel("���¹�ȣ",JLabel.CENTER);
		idLb.setFont(new Font("���� ���",Font.BOLD,18));
		idLb.setBorder(BorderFactory.createBevelBorder(0));
		idTf=new JTextField();
		idTf.setFont(new Font("���� ���",Font.BOLD,18));
		idTf.setEditable(false);
		nameLb=new JLabel("�̸�",JLabel.CENTER);
		nameLb.setFont(new Font("���� ���",Font.BOLD,18));
		nameLb.setBorder(BorderFactory.createBevelBorder(0));
		nameTf=new JTextField();
		nameTf.setFont(new Font("���� ���",Font.BOLD,18));
		nameTf.setEditable(false);
		balanceLb=new JLabel("�ܾ�",JLabel.CENTER);
		balanceLb.setFont(new Font("���� ���",Font.BOLD,18));
		balanceLb.setBorder(BorderFactory.createBevelBorder(0));
		balanceTf=new JTextField();
		balanceTf.setFont(new Font("���� ���",Font.BOLD,18));
		balanceTf.setEditable(false);
		gl.add(idLb);
		gl.add(idTf);
		gl.add(nameLb);
		gl.add(nameTf);
		gl.add(balanceLb);
		gl.add(balanceTf);
		north.add(gl,BorderLayout.CENTER);
		
		//���
		String[] titleName=new String[]{"���¹�ȣ","�̸�","�ܾ�"};
		model=new DefaultTableModel(titleName,0);
		jTable=new JTable(model);
		jTable.setRowHeight(30);
		jTable.getColumnModel().getColumn(0).setPreferredWidth(150);
		jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
		jTable.getColumnModel().getColumn(2).setPreferredWidth(350);
		JScrollPane tabScroll=new JScrollPane(jTable);
		this.jTableSet();
		
		//�Ʒ�
		JPanel south=new JPanel(new GridLayout(1,6,3,3));
		south.setPreferredSize(new Dimension(500,50));
		
		makeBtn=new JButton("���°���");
		makeBtn.setFont(new Font("���� ���",Font.BOLD,18));
		depositBtn=new JButton("�Ա�");
		depositBtn.setFont(new Font("���� ���",Font.BOLD,18));
		withdrawBtn=new JButton("���");
		withdrawBtn.setFont(new Font("���� ���",Font.BOLD,18));
		inquireBtn=new JButton("�ܾ���ȸ");
		inquireBtn.setFont(new Font("���� ���",Font.BOLD,18));
		deleteBtn=new JButton("��������");
		deleteBtn.setFont(new Font("���� ���",Font.BOLD,18));
		
		south.add(makeBtn);
		south.add(depositBtn);
		south.add(withdrawBtn);
		south.add(inquireBtn);
		south.add(deleteBtn);
		
		con.add(north,BorderLayout.NORTH);
		con.add(tabScroll, BorderLayout.CENTER);
		con.add(south,BorderLayout.SOUTH);
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void jTableSet(){
		AccountDao accountDao=new AccountDao();
		ArrayList<AccountDto> list=accountDao.showData();
		
		if(list.size()!=0){
			for(int i=0;i<list.size();i++){
				AccountDto accountDto=list.get(i);
				Vector<Object> rowData=new Vector<Object>();
				
				rowData.add(accountDto.getId());
				rowData.add(accountDto.getName());
				rowData.add(accountDto.getBalance());
				
				model.addRow(rowData);
			}
		}
	}
	
	public void clearText(){
		idTf.setText("");
		nameTf.setText("");
		balanceTf.setText("");
		idTf.setEditable(false);
		nameTf.setEditable(false);
		balanceTf.setEditable(false);
	}
	
	public void viewEvent(){
		makeBtn.addActionListener(this);
		depositBtn.addActionListener(this);
		withdrawBtn.addActionListener(this);
		inquireBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AccountDto accountDto=new AccountDto();
		AccountDao accountDao=new AccountDao();
		int value=0;
		
		if(e.getSource()==makeBtn){
			idTf.setEditable(true);
			nameTf.setEditable(true);
			balanceTf.setEditable(true);
			balanceLb.setText("�Աݾ�");
			
			if((!idTf.getText().isEmpty()|| !idTf.getText().equals(""))&&
					(!nameTf.getText().isEmpty()|| !nameTf.getText().equals(""))&&
					(!balanceTf.getText().isEmpty()|| !balanceTf.getText().equals(""))){
				accountDto.setId(idTf.getText());
				accountDto.setName(nameTf.getText());
				accountDto.setBalance(Long.parseLong(balanceTf.getText()));
				
				value=accountDao.makeAccount(accountDto);
				
				if(value==1){
					JOptionPane.showMessageDialog(this, "���� ���� ����","���°���",JOptionPane.INFORMATION_MESSAGE);
					model.setRowCount(0); //���̺� �������
					this.jTableSet();
				}else{
					JOptionPane.showMessageDialog(this, "���� ���� ����","���°���",JOptionPane.ERROR_MESSAGE);
				}
				balanceLb.setText("�ܾ�");
				this.clearText();
			}
		}else if(e.getSource()==depositBtn){
			String id=JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���");
			accountDto=accountDao.deposit(id);
			
			if(accountDto !=null){
				idTf.setText(accountDto.getId());
				nameTf.setText(accountDto.getName());
				balanceTf.setText(Long.toString(accountDto.getBalance()));

				String balance=JOptionPane.showInputDialog("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
				value=accountDao.deposit(accountDto.getId(),Long.parseLong(balance),accountDto.getBalance());
			}else{
				JOptionPane.showMessageDialog(this, "���������ʴ� ���� �Դϴ�.","�Ա�",JOptionPane.ERROR_MESSAGE);
			}
			
			if(value==1){
				JOptionPane.showMessageDialog(this, "�Ա� ����","�Ա�",JOptionPane.INFORMATION_MESSAGE);
				model.setRowCount(0); //���̺� �������
				this.jTableSet();
			}else{
				JOptionPane.showMessageDialog(this, "�Ա� ����","�Ա�",JOptionPane.ERROR_MESSAGE);
			}
			this.clearText();
		}else if(e.getSource()==withdrawBtn){
			String id=JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���");
			accountDto=accountDao.deposit(id);
			
			if(accountDto!=null){
				idTf.setText(accountDto.getId());
				nameTf.setText(accountDto.getName());
				balanceTf.setText(Long.toString(accountDto.getBalance()));
	
				String money=JOptionPane.showInputDialog("��ݾ��� �Է��ϼ���");
				int result=0;
				if(accountDto.getBalance()>Long.parseLong(money)){
					result=accountDao.withdraw(accountDto.getId(),accountDto.getBalance(),Long.parseLong(money));
					
					if(result==1){
						JOptionPane.showMessageDialog(this, "��� ����","���",JOptionPane.INFORMATION_MESSAGE);
						model.setRowCount(0); //���̺� �������
						this.jTableSet();
					}else{
						JOptionPane.showMessageDialog(this, "��� ����","���",JOptionPane.ERROR_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(this, "�ܾ׺���","���",JOptionPane.ERROR_MESSAGE);
				}
				this.clearText();
			}else{
				JOptionPane.showMessageDialog(this, "���¹�ȣ �������","���",JOptionPane.ERROR_MESSAGE);
			}
			
		}else if(e.getSource()==inquireBtn){
			String id=JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���");
			accountDto=accountDao.deposit(id);
			
			if(accountDto !=null){
				idTf.setText(accountDto.getId());
				nameTf.setText(accountDto.getName());
				balanceTf.setText(Long.toString(accountDto.getBalance()));
			}else{
				JOptionPane.showMessageDialog(this, "���������ʴ� ���� �Դϴ�.","�Ա�",JOptionPane.ERROR_MESSAGE);
			}
		}else if(e.getSource()==deleteBtn){
			new AccountAnother();
			super.setVisible(false);
		}
	}
}
