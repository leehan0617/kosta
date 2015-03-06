package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//Stream : ����Ʈ��Ʈ��(output,input),���ڽ�Ʈ��
public class Exam125 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		File file=null;
		
		try{
			file=new File("text1.txt");
			fos=new FileOutputStream(file);
			
			byte[] by=new byte[]{'a','p','p','l','e'};
			fos.write(by);
			
			System.out.println("�Ϸ�Ǿ����ϴ�.");
		}catch(FileNotFoundException e){
			System.out.println("���� ���� ����");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("����½� ����");
			e.printStackTrace();
		}finally{
			try{
				fos.close();
			}catch(Exception e){
				System.out.println("close ����");
				e.printStackTrace();
			}
		}
	}
}
