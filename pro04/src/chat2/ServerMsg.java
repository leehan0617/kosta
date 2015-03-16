package chat2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ServerMsg extends Thread {
	private Socket socket;
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;
	PrintWriter pw=null;
	Scanner sc=null;
	InputStreamReader isr=null;
	BufferedReader br=null;
	
	public ServerMsg(Socket socket){
		this.socket=socket;
	}
	
	public void sendMsg(){
		try {
			while(true){
			sc=new Scanner(System.in);
			osw=new OutputStreamWriter(socket.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			String outMsg=sc.nextLine();
			pw.println("서버"+">>"+outMsg);
			pw.flush();
			if(outMsg.equalsIgnoreCase("q"))break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void receiveMsg(){
		try {
			while(true){
			isr=new InputStreamReader(socket.getInputStream());
			br=new BufferedReader(isr,512);
			String readMsg=br.readLine();
			System.out.println(readMsg);
			if(readMsg.equalsIgnoreCase("q"))break;
			}
		}catch(SocketException e){
			System.out.println("클라이언트나감");
			System.out.println("서버 종료합니다.");
			System.exit(0);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		try{
			receiveMsg();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(socket!=null) socket.close();
				if(sc!=null)sc.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
	
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
