package ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//Server
public class Network02 {
	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		ServerSocket ss=null;
		Socket s=null;
		String data=" ";
		
		try{
			ss=new ServerSocket(1234);
			System.out.println("서버 준비중입니다.");
			s=ss.accept();
			
			isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr,512);
			
			data=br.readLine();
			System.out.println(data+":"+s.getInetAddress());
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
				if(isr!=null)isr.close();
				if(s!=null) s.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
