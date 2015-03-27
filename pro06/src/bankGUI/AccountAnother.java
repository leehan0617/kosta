package bankGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import bankModel.AccountDao;

public class AccountAnother extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idTf;
	private JLabel id;
	private JButton btn;
	
	public AccountAnother(){
		this.viewInit();
	}
	
	public void viewInit(){
		super.setTitle("���� ����");
		super.setSize(300,200);
		super.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		id=new JLabel("���¹�ȣ");
		idTf=new JTextField(10);
		btn=new JButton("���� ����");
		btn.addActionListener(this);
		
		super.add(id);
		super.add(idTf);
		super.add(btn);
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AccountDao accountDao=new AccountDao();
		int value=accountDao.delete(idTf.getText());
		if(value>0){
			JOptionPane.showMessageDialog(this, "���� ����","����",JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(this, "���������ʴ� ���� �Դϴ�.","�Ա�",JOptionPane.ERROR_MESSAGE);
		}
		new AccountView();
		super.setVisible(false);
	}	
}
