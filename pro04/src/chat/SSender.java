package chat;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SSender extends Thread{
	private	Socket socket;
	
	public SSender(Socket socket){
		this.socket=socket;
	}

	@Override
	public void run(){
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try{
			osw=new OutputStreamWriter(socket.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			while(true){
				String outputMsg=sc.nextLine();
				if(outputMsg.equalsIgnoreCase("Q")){
					pw.println(outputMsg);
					pw.flush();
					break;
				}
				pw.println("¼­¹ö >>"+outputMsg);
				pw.flush();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(sc!=null)sc.close();
				if(socket!=null)socket.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}