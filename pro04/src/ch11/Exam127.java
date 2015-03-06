package ch11;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam127 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		File file=null;
		BufferedOutputStream bos=null;
		
		try{
			file=new File("test2.txt");
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos,1024);
			byte[] by=new byte[]{'a','b','c','d','e'};
			
			bos.write(by);
			bos.flush();
			
			System.out.println("완료되었습니다.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				bos.close();
				fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
