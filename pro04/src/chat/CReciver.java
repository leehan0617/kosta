package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CReciver extends Thread{
	private Socket socket;
	
	public CReciver(Socket socket){
		this.socket=socket;
	}
	
	public void run(){
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try{
			isr=new InputStreamReader(socket.getInputStream());
			br=new BufferedReader(isr,512);
			
			while(true){
				String inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("Q")){
				break;
				}
				System.out.println(inputMsg);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(socket!=null)socket.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
