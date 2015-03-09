package ch12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Network06 {
	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner scan=null;
		
		ServerSocket ss=null;
		Socket soc=null;
		try{
			ss=new ServerSocket(5789);
			System.out.println("서버 대기중");
			soc=ss.accept();
			
			//입력
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			String str=null;
			
			//출력
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			//입력
			while(true){
				str=br.readLine();
				if(str.equalsIgnoreCase("Q")) break;
				System.out.println(str);
			}
			
			//출력	
			while(true){
				scan=new Scanner(System.in);
				System.out.print("서버가 클라이언트에게:");
				str=scan.nextLine();
				if(str.equalsIgnoreCase("Q")) break;
				pw.println("Server >>"+str);
				pw.flush();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
				if(isr!=null) isr.close();
				
				if(scan!=null)scan.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(osw!=null)osw.close();
				
				if(soc!=null) soc.close();
				if(ss!=null) ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
