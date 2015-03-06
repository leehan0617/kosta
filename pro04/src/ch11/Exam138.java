package ch11;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Test implements Serializable{
	private int x;
	private float y;
	private char z;
	
	public Test(int x,float y,char z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void disp(){
		System.out.println("x:"+x+"\ty:"+y+"\tz:"+z);
	}
}

public class Exam138 {
	public static void main(String[] args) {
		File file=null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
		
		Test a=new Test(10,42.2f,'A');
		Test c=new Test(42,32.1f,'D');
		Test b=new Test(64,12.5f,'Q');
		
		ArrayList<Test> list=new ArrayList<Test>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(new Test(1,2.2f,'c'));
		
		try{
			file=new File("test6.txt");
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos,1024);
			oos=new ObjectOutputStream(bos);
			
//			oos.writeObject(a);
//			oos.writeObject(b);
//			oos.writeObject(c);
			oos.writeObject(list);
			oos.flush();
			System.out.println("¿Ï·á");
		}catch(EOFException e){
			
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
