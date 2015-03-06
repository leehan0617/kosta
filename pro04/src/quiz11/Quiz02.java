package quiz11;

import java.io.*;

public class Quiz02 {
	public static void main(String[] args) {
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		DataInputStream dis=null;
		BufferedReader br=null;
		
		try{
			file=new File("quiz02.txt");
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis,1024);
			br=new BufferedReader(new InputStreamReader(bis));
			String str=br.readLine();
			System.out.println(str.toUpperCase());
		}catch(EOFException e){
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(dis!=null) dis.close();
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
				if(br!=null) br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
