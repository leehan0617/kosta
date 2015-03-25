package view02;

import java.io.File;

import javax.swing.JFileChooser;

public class Exam21 {
	public static void main(String[] args) {
		JFileChooser fdLoad=new JFileChooser();
		int value=fdLoad.showOpenDialog(null);
		System.out.println(value);
		System.out.println(fdLoad.getSelectedFile().getPath());
		System.out.println(fdLoad.getSelectedFile().getName());
		
		JFileChooser fdSave=new JFileChooser();
		int valueS=fdSave.showSaveDialog(null);
		System.out.println(valueS);
		
		if(valueS==0){
			File saveFile=fdSave.getSelectedFile();
			String savePath=saveFile.getAbsolutePath();
			System.out.println(savePath);
		}
	}
}
