package ch12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//Client
public class Network01 {
	public static void main(String[] args) {
		Socket s=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try{
			s=new Socket("192.168.7.208",1234);
			osw=new OutputStreamWriter(s.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			sc=new Scanner(System.in);
			
			System.out.print("Message:");
			String data=sc.nextLine();
			
			
//			pw.println("Client Message:"+data);
			pw.println("ÀÌÇÑºó >>"+data);
			pw.flush();
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();		
		}finally{
			try{
				if(pw!=null)	pw.close();
				if(bw!=null)	bw.close();
				if(osw!=null)	osw.close();
				if(s!=null)		s.close();
				if(sc!=null)    sc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
