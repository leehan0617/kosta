package quiz12;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Quiz03 {
	public static void main(String[] args) {
		OutputStream osw=null;
		BufferedOutputStream bos=null;
		PrintWriter pw=null;
		Socket soc=null;
		char ch;
		
		try{
			soc=new Socket("192.168.7.208",33233);
			osw=soc.getOutputStream();
			bos=new BufferedOutputStream(osw,512);
			pw=new PrintWriter(bos);
			System.out.print("서버에게 보낼 문자:");
			ch=(char)System.in.read();
			
			pw.println(ch);
			pw.flush();
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(pw!=null)pw.close();
				if(bos!=null) bos.close();
				if(osw!=null)osw.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
