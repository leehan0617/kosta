package quiz12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Socket soc=null;
		Scanner scan=null;
		
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try{
			soc=new Socket("192.168.7.208",33233);
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			scan=new Scanner(System.in);
			
			while(true){
			
			System.out.print("서버에게 보낼 메시지:");
			String str=scan.nextLine();
			
			pw.println(str);
			pw.flush();
			if(str.equals("q"))  break;
			}
			
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			String str=br.readLine();
			System.out.println(str);
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(scan!=null)scan.close();
				if(pw!=null)pw.close();
				if(br!=null)br.close();
				if(osw!=null)osw.close();
				if(bw!=null)bw.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
