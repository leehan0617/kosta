package chat;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SReciver extends Thread {
	private Socket socket;
	
	public SReciver(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run(){
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try{
			isr=new InputStreamReader(socket.getInputStream());
			br=new BufferedReader(isr,512);
			
			while(true){
				String inputMsg=br.readLine();
				if(inputMsg.equalsIgnoreCase("q")) {
					OutputStreamWriter osw=
							new OutputStreamWriter(socket.getOutputStream());
					BufferedWriter bw=new BufferedWriter(osw,512);
					PrintWriter pw=new PrintWriter(bw);
					pw.println("q");
					pw.flush();
					break;
				}
				System.out.println(inputMsg);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(socket!=null)socket.close();
				if(br!=null) br.close();
				if(isr!=null) isr.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}