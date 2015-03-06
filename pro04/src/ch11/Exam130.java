package ch11;

import java.io.*;

public class Exam130 {
	public static void main(String[] args) {
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		DataInputStream dis=null;
		
		try{
			file=new File("test3.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis, 1024);
			dis=new DataInputStream(bis);
			
//			for(int i=0;i<4;i++){
//				System.out.print(dis.readInt()+"\t");
//			}
			while(true){
				System.out.print(dis.readInt()+"\t");
			}
		}catch(EOFException e){
				
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}finally{
			try{
				dis.close();
				bis.close();
				fis.close();
			}catch(Exception e){
				
			}
		}
	}

}
