package view04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerChat extends JFrame implements Runnable{
	private static final long serialVersionUID = 1L;
	private JTextArea ta;
	private JTextField tf;
	private ServerSocket serverSocket;
	private Socket soc;
	private String nickName;
	
	private InputStreamReader isr;
	private BufferedReader br;
	
	private OutputStreamWriter osw;
	private BufferedWriter bw;
	private PrintWriter pw;
	
	public ServerChat(String nickName,ServerSocket serverSocket){
		super.setTitle("채팅창 서버");
		super.setSize(300,400);
		this.nickName=nickName;
		this.serverSocket=serverSocket;
		this.inputView();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void inputView(){
		ta=new JTextArea("대화창");
		ta.setEditable(false);
		JScrollPane jRoll=new JScrollPane(ta);
		tf=new JTextField();
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			soc=serverSocket.accept();
			ta.setText("서버가 준비되었습니다.\n");
			ta.append("상대방과 연결되었습니다.\n");
			
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			
			while(true){
				String msg=br.readLine();
				if(msg==null){
					break;
				}
				ta.append(msg+"\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(soc!=null)soc.close();
				if(serverSocket!=null)serverSocket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
