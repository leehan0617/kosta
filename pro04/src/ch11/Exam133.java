package ch11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam133 {
	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			file=new File("news.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			while(true){
				String str=br.readLine();
				if(str==null) break;
				
				System.out.println(str);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
