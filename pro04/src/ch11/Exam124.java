package ch11;

import java.io.File;
import java.io.IOException;

public class Exam124 {
	public static void main(String[] args) throws IOException {
		File[] roots=File.listRoots();
		for(int i=0;i<roots.length;i++){
			System.out.println(i+":"+roots[i]);
		}
		
		System.out.println();
		File file=new File("C:\\JAVA\\workspace\\pro03\\src\\ch10");
		if(file.exists()){
			String[] str=file.list();
			for(int i=0;i<str.length;i++){
				System.out.println(str[i]);
			}
		}
		
		System.out.println();
		File f=new File(file,"Exam113.java");
		if(f.isFile()){
			System.out.println("���ϸ�:"+f.getName());
			System.out.println("��θ�:"+f.getParent());
			System.out.println("��θ�2:"+f.getAbsolutePath());
			System.out.println("���Ⱑ��:"+f.canWrite());
			System.out.println("�бⰡ��:"+f.canRead());
			System.out.println("����ũ��:"+f.length()+"byte");
		}
		
		//���� �����,����
		File newFile=new File("abc.txt");
		if(newFile.createNewFile()){            //default���: �ڽ��� ������Ʈ ���
			System.out.println("���� ���� �Ϸ�");
		}
		File newFile2=new File("C:\\JAVA\\abcd.txt"); //�������
		if(newFile2.createNewFile()){
			System.out.println("���� ���� �Ϸ�");
		}
		
		if(newFile.isFile()){
			newFile.delete();
			System.out.println("���� ���� �Ϸ�");
		}
		
		//������ ����,����
		File newDir=new File("C:\\JAVA\\����");
		if(newDir.mkdir()){
			System.out.println("���丮 ���� �Ϸ�");
		}
		if(newDir.isDirectory()){
			newDir.delete();
			System.out.println("���丮 ���� �Ϸ�");
		}
		
		File newDir2=new File("C:\\JAVA\\TEST");
		if(newDir2.mkdir()){
			System.out.println("���丮 ���� �Ϸ�");
		}
		
		if(newDir2.isDirectory()){
			File cfile=new File(newDir.getAbsolutePath()+"/xyz.txt");
			cfile.createNewFile();
			System.out.println("���ϻ����Ϸ�");
			
			cfile.delete();
			System.out.println("���ϻ����Ϸ�");
			newDir2.delete();
			System.out.println("���丮 �����Ϸ�");
		}
	} 
}
