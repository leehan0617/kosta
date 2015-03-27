package view04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientChat extends JFrame implements Runnable{
	private static final long serialVersionUID = 1L;
	private JTextArea ta;
	private JTextField tf;
	
	private Socket socket;
	private String nickName;
	
	private OutputStreamWriter osw;
	private BufferedWriter bw;
	private PrintWriter pw;
	
	private InputStreamReader isr;
	private BufferedReader br;
	
	public ClientChat(String nickName,Socket socket){
		super.setTitle("클라이언트 채팅방");
		super.setBounds(300,400,400,400);
		this.socket=socket;
		this.nickName=nickName;
		this.inputView();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void inputView(){
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane jRoll=new JScrollPane(ta);
		tf=new JTextField("내용을 입력하세요.");
		
		tf.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				super.mouseClicked(e);
				tf.setText("");
			}			
		});
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String msg=tf.getText();
				if(msg.equals("") ||msg.isEmpty()){
					return;
				}
				
				if(pw!=null){
					pw.println(nickName+">>"+msg);
					pw.flush();
				}	
				
				ta.append(nickName+">>"+msg+"\n");
				tf.setText("");
			}
		});
		
		super.add(jRoll,"Center"); //Layout default는 borderlayout
		super.add(tf, "South");
	}

	@Override
	public void run() {
		try{
			//보내기
			osw=new OutputStreamWriter(socket.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			//받기
			isr=new InputStreamReader(socket.getInputStream());
			br=new BufferedReader(isr,512);
			
			while(true){
				String msg=br.readLine();
				if(msg==null) break;
				ta.append(msg+"\n");	
			}
		}catch(SocketException e){
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(socket!=null)socket.close();
			}catch(Exception e){
				
			}
		}
	}
}
