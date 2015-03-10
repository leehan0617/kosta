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

public class Quiz05 {
	public static void main(String[] args) {
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner scan=null;
		Socket soc=null;
		char buho=' ';
		String outStr="";
		int num1,num2;
		
		InputStreamReader isr=null;
		BufferedReader br=null;
		try{
			soc=new Socket("192.168.7.208",33233);
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			scan=new Scanner(System.in);
			
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			
			System.out.print("첫번째 수입력:");
			num1=scan.nextInt();
			System.out.print("부호 입력:");
			buho=(char)System.in.read();
			System.out.print("두번째 수입력:");
			num2=scan.nextInt();
			
			outStr=num1+" "+buho+" "+num2;
			
			pw.println(outStr);
			pw.flush();
			
			System.out.println(br.readLine());
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
