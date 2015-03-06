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
			int count=fis.read(by); //���� �� ����
			
			for(int i=0;i<count;i++){
				System.out.println((char)by[i]);
			}
			System.out.println();
			
			while(true){
				int cnt=fis.read();  //���ϳ��������ϸ� -1 ����
				if(cnt==-1){
					System.out.println((char)cnt);
					break;
				}
			}
			
			fis.close();
		}catch(FileNotFoundException e){
			System.out.println("���� �������");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("����� ����");
			e.printStackTrace();
		}
	}
}
