package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//Stream : 바이트스트림(output,input),문자스트림
public class Exam125 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		File file=null;
		
		try{
			file=new File("text1.txt");
			fos=new FileOutputStream(file);
			
			byte[] by=new byte[]{'a','p','p','l','e'};
			fos.write(by);
			
			System.out.println("완료되었습니다.");
		}catch(FileNotFoundException e){
			System.out.println("파일 존재 안함");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("입출력시 오류");
			e.printStackTrace();
		}finally{
			try{
				fos.close();
			}catch(Exception e){
				System.out.println("close 에러");
				e.printStackTrace();
			}
		}
	}
}
