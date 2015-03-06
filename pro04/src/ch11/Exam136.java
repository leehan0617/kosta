package ch11;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

//직렬화(Serialization) 객체를 스트림으로 만드는것
public class Exam136 {
	public static void main(String[] args) {
		File file=null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
	
		try{
			file=new File("test5.txt");
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos,1024);
			oos=new ObjectOutputStream(bos);
			
			oos.writeObject(new GregorianCalendar(1990,5,3));
			oos.writeObject(new GregorianCalendar(1992,5,3));
			oos.writeObject(new GregorianCalendar(1997,5,3));
			oos.flush();
			System.out.println("출력완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(oos!=null)oos.close();
				if(bos!=null)bos.close();
				if(fos!=null)fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
