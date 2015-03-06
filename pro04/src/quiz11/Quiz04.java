package quiz11;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz04 {
	public static void main(String[] args) {
		File file=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		DataInputStream dis=null;
		FileReader fr=null;
		BufferedReader br=null;
	
		try{
			file=new File("quiz04.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String str=br.readLine();
			System.out.println(str);
			String str2=br.readLine();
			System.out.println(str2);
			int sum1=0,sum2=0;
			
			StringTokenizer stok1=new StringTokenizer(str);
			StringTokenizer stok2=new StringTokenizer(str2);
			
			while(stok1.hasMoreTokens()){
				int i=Integer.parseInt(stok1.nextToken());
				sum1+=i;
			}
			while(stok2.hasMoreTokens()){
				int i=Integer.parseInt(stok2.nextToken());
				sum2+=i;
			}
			
			System.out.println("sum1:"+sum1);
			System.out.println("sum2:"+sum2);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(dis!=null)dis.close();
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
