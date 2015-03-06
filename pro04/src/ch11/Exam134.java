package ch11;

import java.io.*;

public class Exam134 {
	public static void main(String[] args) {
		File inputFile=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		File outputFile=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		try{
			inputFile=new File("news.txt");
			fr=new FileReader(inputFile);
			br=new BufferedReader(fr,1024);
			
			outputFile=new File("output.txt");
			fw=new FileWriter(outputFile);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				pw.println(str);
				System.out.println(str);	
			}
			
			pw.flush();
			System.out.println("출력완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
