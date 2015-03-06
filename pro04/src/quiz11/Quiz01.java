package quiz11;

import java.io.*;

public class Quiz01 {
	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		String[] str=new String[6];
		
		try{
			file=new File("quiz01.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr,1024);
			
			for(int i=0;i<str.length;i++){
				str[i]=br.readLine();
				System.out.println((i+1)+"\t"+str[i]);
			}
		}catch(EOFException e){
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
