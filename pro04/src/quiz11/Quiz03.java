package quiz11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Quiz03 {
	public static void main(String[] args) {
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		String[] str=new String[6];
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br2=new BufferedReader(isr);
		
		try{
			file=new File("quiz01.txt");
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			for(int i=0;i<str.length;i++){
				str[i]=br.readLine();
			}
			
			System.out.print("�����Է�:");
			String input=br2.readLine();
			
			for(int i=0;i<str.length;i++){
				if(input.equals(str[i])){
					System.out.println("������ ���ڰ������մϴ�."+str[i]); break;
				}else{
					System.out.println("������ ���ڰ� ���������ʽ��ϴ�.");
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
				if(br2!=null)br2.close();
				if(fr!=null) fr.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
