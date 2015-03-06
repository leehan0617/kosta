package ch11;

import java.io.*;

public class Exam128 {
	public static void main(String[] args) {
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			file=new File("test2.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis,1024);
						
			while(true){
				int count=bis.read();
				if(count==-1) break;
				System.out.println((char)count);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				bis.close();
				fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
