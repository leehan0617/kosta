package ch12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Network03 {
	public static void main(String[] args) {
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Socket soc=null;
		Scanner scan=null;
		
		InputStreamReader isr=null;
		BufferedReader br=null;
		try{
			soc=new Socket(args[0],8012);
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			scan=new Scanner(System.in);
			
			System.out.print("Message:");
			String data=scan.nextLine();
			
			pw.println("Client >>"+data);
			pw.flush();
			
			//Client 입력
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			System.out.println(br.readLine());
		}catch(UnknownHostException e){
			System.out.println("주소 존재안함");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("Network 입출력시 에러");
			e.printStackTrace();
		}finally{
			try{
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(osw!=null)osw.close();
				if(scan!=null)scan.close();
				
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
