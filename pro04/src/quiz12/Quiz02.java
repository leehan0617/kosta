package quiz12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz02 {
	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		Socket soc=null;
		ServerSocket ss=null;
		String str=null;
		
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try{
			ss=new ServerSocket(33233);
			System.out.println("서버 준비중...");
			soc=ss.accept();
			
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			while(true){
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			str=br.readLine();
			
			if(str.equals("q")){
				System.out.println("시스템을 종료합니다.");	break;
			}
			System.out.println(str);
			}
			
			pw.println("시스템을 종료합니다");
			pw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
				if(isr!=null)isr.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
