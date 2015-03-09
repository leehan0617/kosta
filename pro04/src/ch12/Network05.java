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

public class Network05 {
	public static void main(String[] args) {
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Socket soc=null;
		Scanner scan=null;
		
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try{
			//출력
			soc=new Socket(args[0],5789);
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			scan=new Scanner(System.in);
			String str=null;
			String inputStr=null;
			
			//입력
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			
			while(true){
				System.out.print("서버에게 보내는 메시지:");
				str=scan.nextLine();
				
				if(str.equalsIgnoreCase("Q")){
					pw.println(str);
					pw.flush();
					break;
				}
				pw.println("Client >>"+str);
				pw.flush();
			}
			
			//입력
			while(true){
				inputStr=br.readLine();
				if(inputStr.equalsIgnoreCase("Q")) break;
				System.out.println("Message:"+inputStr);
			}
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(osw!=null)osw.close();
				if(scan!=null)scan.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
