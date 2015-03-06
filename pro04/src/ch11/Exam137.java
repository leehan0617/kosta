package ch11;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam137 {
	public static void main(String[] args){
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		
		try{
			file=new File("test5.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis,1024);
			ois=new ObjectInputStream(bis);
			
			GregorianCalendar calendar=null;
			SimpleDateFormat sdf=null;
			
			while(true){
				calendar=(GregorianCalendar)ois.readObject();
				sdf=new SimpleDateFormat("yyyy-MM-dd");
				Date d=calendar.getTime();
				System.out.println(sdf.format(d));
			}
		}catch(EOFException e){
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(ois!=null)ois.close();
				if(bis!=null)bis.close();
				if(fis!=null)fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
