package quiz11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Quiz05 {
	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try{
			file=new File("quiz05.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,1024);
			pw=new PrintWriter(bw);
			String input=" ";
			is=System.in;
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
	
			while(true){
				System.out.print("데이터를 입력해주세요 (종료Q)");
				input=br.readLine();
				
				if(input.equals("Q")){
					System.out.println("종료되었습니다."); 
					break ;
				}else{
					pw.println(input);
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
