package ch11;

import java.io.*;

public class Exam131 {
	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null; //OutputStream
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		try{
			file=new File("test4.txt");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,1024);
			pw=new PrintWriter(bw);
			
			pw.println(10);
			pw.println("ABC");
			pw.println('A');
			pw.println(14.4f);
			
			System.out.println("���ϻ����Ϸ�");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(pw!=null) pw.close(); //PrintWriter�� close���̾��ص���.
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
