package ch11;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam129 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		File file=null;
		BufferedOutputStream bos=null;
		DataOutputStream dos=null;
		
		try{
			file=new File("test3.txt");
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos,1024);
			dos=new DataOutputStream(bos);         //buferoutpustream은 바이트형 밖에 받지 못하므로 형변환을 위해 DataOutputStream을 사용
			int[] array=new int[]{10,20,30,40,50};
			
			for(int i=0;i<array.length;i++){
				dos.writeInt(array[i]);
			}
			
			dos.flush();
			System.out.println("완료되었습니다.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				dos.close();
				bos.close();
				fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
