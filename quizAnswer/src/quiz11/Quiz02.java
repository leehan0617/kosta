package quiz11;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Quiz02 {
	public static void main(String[] args){
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try{
			file=new File("quiz02.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis, 1024);
			
			while(true){
				int cnt=bis.read();
				if(cnt==-1) break;
				String str=String.valueOf((char)cnt);
				System.out.print(str.toUpperCase());
			}
			
			fis.close();		// close �� �� ��� ������ �սǿ� �� �� �ִ�.
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� ���Ͽ����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}
