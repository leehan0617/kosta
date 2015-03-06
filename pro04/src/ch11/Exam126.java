package ch11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam126 {
	public static void main(String[] args) {
		try{
			File file=new File("text1.txt");
			FileInputStream fis=new FileInputStream(file);
			
			byte[] by=new byte[65536];
			int count=fis.read(by); //문자 수 리턴
			
			for(int i=0;i<count;i++){
				System.out.println((char)by[i]);
			}
			System.out.println();
			
			while(true){
				int cnt=fis.read();  //파일끝에도달하면 -1 리턴
				if(cnt==-1){
					System.out.println((char)cnt);
					break;
				}
			}
			
			fis.close();
		}catch(FileNotFoundException e){
			System.out.println("파일 존재안함");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("입출력 에러");
			e.printStackTrace();
		}
	}
}
