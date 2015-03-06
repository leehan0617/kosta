package ch11;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Exam139 {
	public static void main(String[] args) {
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		ObjectInputStream ois=null;
		
//		Test test=null;
		ArrayList<Test> list=null;
		try{
			file=new File("test6.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis,1024);
			ois=new ObjectInputStream(bis);
			
			while(true){
//				test=(Test)ois.readObject();
//				test.disp();
				list=(ArrayList<Test>)ois.readObject();
				Iterator<Test> iter=list.iterator();
				while(iter.hasNext()){
					iter.next().disp();
				}
			}
		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
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
