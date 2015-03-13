package multiChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerArray extends Thread {
	private Socket socket;
	private static List<PrintWriter> list=
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	private OutputStreamWriter osw;
	private BufferedWriter bw;
	private PrintWriter pw;
	
	public ServerArray(Socket socket){
		this.socket=socket;
		this.sendArr();
	}
	
	public void sendArr(){
		try{
			osw=new OutputStreamWriter(socket.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			list.add(pw);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void sendPrint(String msg){
		for(PrintWriter pw:list){
			pw.println(msg);
			pw.flush();
		}
	}
	
	public void run(){
		InputStreamReader isr=null;
		BufferedReader br=null;
		String id="";
		
		try{
			isr=new InputStreamReader(socket.getInputStream());
			br=new BufferedReader(isr,512);
			
			id=br.readLine();
			sendPrint("#"+id+"님이 입장하였습니다.");
			
			while(true){
				String inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")){
					sendPrint(inputMsg); break;
				}
				sendPrint(id+">>"+inputMsg);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			sendPrint("#"+id+"님이 퇴장하였습니다.");
			list.remove(pw);
			try{
				if(socket!=null)socket.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				
				if(isr!=null)isr.close();
				if(br!=null)br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	} //end of run()
} //end of Class