package quiz12;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz04 {
	public static void main(String[] args) {
		InputStream is=null;
		BufferedInputStream bis=null;
		ServerSocket ss=null;
		Socket soc=null;
		char ch;
		try{
			ss=new ServerSocket(33233);
			System.out.println("서버 대기중:");
			soc=ss.accept();
			
			is=soc.getInputStream();
			bis=new BufferedInputStream(is,512);
			
			ch=(char)bis.read();
			System.out.println(ch);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(bis!=null)bis.close();
				if(is!=null)is.close();
				if(soc!=null)soc.close();
				if(ss!=null)ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
