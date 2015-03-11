package chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CSender extends Thread{
	private Socket soc;
	private String nickName;
	
	public CSender(Socket soc,String nickName){
		this.soc=soc;
		this.nickName=nickName;
		
		System.out.println("채팅시작");
	}
	
	@Override
	public void run(){
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try{
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			while(true){
				String outputMsg=sc.nextLine();
				if(outputMsg.equalsIgnoreCase("q")){
					pw.println(outputMsg);
					break;
				}
				pw.println(this.nickName+">>"+outputMsg);
				pw.flush();
			}
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(sc!=null)sc.close();
				if(soc!=null)soc.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}