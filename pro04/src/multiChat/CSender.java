package multiChat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CSender extends Thread {
	private Socket socket;
	private String id;
	
	public CSender(Socket s,String id){
		this.socket=s;
		this.id=id;
		System.out.println("채팅시작");
	}
	
	public void run(){
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner scan=null;
		
		try{
			osw=new OutputStreamWriter(socket.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			scan=new Scanner(System.in);
			
			pw.println(id);
			pw.flush();
			
			while(true){
				String outputMsg=scan.nextLine();
				if(outputMsg.equalsIgnoreCase("Q")){
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				pw.println(outputMsg);
				pw.flush();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(socket!=null)socket.close();
				if(scan!=null)scan.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
