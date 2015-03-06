package quiz11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		Scanner sc=null;
		
		try{
			file=new File("quiz03.txt");
			fw=new FileWriter(file);
            bw=new BufferedWriter(fw, 1024);
            pw=new PrintWriter(bw);

            sc=new Scanner(System.in);
            System.out.println("�����͸� �Է��� �ּ���. (����: Q)");
            while(true){
            	String str=sc.nextLine();
            	if(str.equalsIgnoreCase("Q")) break;
            	pw.println(str);
            }
            
            System.out.println("����Ǿ����ϴ�.");
            pw.flush();
		}catch(FileNotFoundException e){
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� ����½� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}finally{
			try{
				if(fw !=null) fw.close();
				if(bw !=null) bw.close();
				if(pw !=null) pw.close();
			}catch(Exception e){
				System.out.println("Cloase Error");
				e.printStackTrace();
			}
		}
	}
}
