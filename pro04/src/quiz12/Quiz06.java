package quiz12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Quiz06 {

	static double result=0;
	public static void main(String[] args) {
		InputStreamReader isr=null;
		BufferedReader br=null;
		ServerSocket ss=null;
		Socket soc=null;
		StringTokenizer st=null;
		String[] array=new String[3];
		int count=0;
		int num1,num2;
		String str="";
		char buho2;
		
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try{
			ss=new ServerSocket(33233);
			System.out.println("서버 대기중");
			soc=ss.accept();
			
			osw=new OutputStreamWriter(soc.getOutputStream());
			bw=new BufferedWriter(osw,512);
			pw=new PrintWriter(bw);
			
			isr=new InputStreamReader(soc.getInputStream());
			br=new BufferedReader(isr,512);
			str=br.readLine();
			st=new StringTokenizer(str," ");
			
			while(st.hasMoreTokens()){
				array[count]=st.nextToken();
				count++;
			}
			
			num1=Integer.parseInt(array[0]);
			num2=Integer.parseInt(array[2]);
			buho2=array[1].charAt(0);
			switch(buho2){
				case '+': result=num1+num2;
					break;
				case '-': result=num1-num2;
					break;
				case '*': result=num1*num2;
					break;
				case '/': result=(double)num1/num2;
					break;
			}
			
			pw.println("사칙연산 결과는:"+result);
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
				if(ss!=null)ss.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}