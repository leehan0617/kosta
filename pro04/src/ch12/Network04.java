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

public class Network04 {
	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		ServerSocket ss=null;;
		Socket soc=null;
		
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner scan=null;
		try{
			ss=new ServerSocket(8012);
			System.out.println("서버 준비중");
			
			soc=ss.accept();
			
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			
			System.out.println(br.readLine()+"\t"+soc.getInetAddress());
			
			//답장
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			scan=new Scanner(System.in);
			System.out.print("답변 메시지:");
			String text=scan.nextLine();
			pw.println("Server >>"+text);
			pw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null)br.close();
				if(isr!=null)isr.close();
			
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(scan!=null)scan.close();
				
				if(soc!=null)soc.close();
				if(ss!=null)ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
