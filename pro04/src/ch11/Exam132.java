package ch11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam132 {
	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			file=new File("test4.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			int i=Integer.parseInt(br.readLine());
			float f=Float.parseFloat(br.readLine());
			String str=br.readLine();
			char ch=(char)br.read();
			br.readLine();
			
			System.out.println("i:"+i);
			System.out.println("f:"+f);
			System.out.println("str:"+str);
			System.out.println("ch:"+ch);
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
