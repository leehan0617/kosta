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
			System.out.println("파일명:"+f.getName());
			System.out.println("경로명:"+f.getParent());
			System.out.println("경로명2:"+f.getAbsolutePath());
			System.out.println("쓰기가능:"+f.canWrite());
			System.out.println("읽기가능:"+f.canRead());
			System.out.println("파일크기:"+f.length()+"byte");
		}
		
		//파일 만들기,삭제
		File newFile=new File("abc.txt");
		if(newFile.createNewFile()){            //default경로: 자신의 프로젝트 경로
			System.out.println("파일 생성 완료");
		}
		File newFile2=new File("C:\\JAVA\\abcd.txt"); //경로지정
		if(newFile2.createNewFile()){
			System.out.println("파일 생성 완료");
		}
		
		if(newFile.isFile()){
			newFile.delete();
			System.out.println("파일 삭제 완료");
		}
		
		//폴더를 생성,삭제
		File newDir=new File("C:\\JAVA\\연습");
		if(newDir.mkdir()){
			System.out.println("디렉토리 생성 완료");
		}
		if(newDir.isDirectory()){
			newDir.delete();
			System.out.println("디렉토리 삭제 완료");
		}
		
		File newDir2=new File("C:\\JAVA\\TEST");
		if(newDir2.mkdir()){
			System.out.println("디렉토리 생성 완료");
		}
		
		if(newDir2.isDirectory()){
			File cfile=new File(newDir.getAbsolutePath()+"/xyz.txt");
			cfile.createNewFile();
			System.out.println("파일생성완료");
			
			cfile.delete();
			System.out.println("파일삭제완료");
			newDir2.delete();
			System.out.println("디렉토리 삭제완료");
		}
	} 
}
