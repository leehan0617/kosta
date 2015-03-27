package view03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class MyFile extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JTextArea content;
	private JMenuBar mb;
	private JMenu mFile;
	private JMenuItem miNew,miOpen,miSaveAs,miExit;
	private String filePath;
	
	public MyFile(String str){
		super(str);
		super.setSize(320,400);
		this.inputView();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void inputView(){
		mb=new JMenuBar();
		super.setJMenuBar(mb);
		
		mFile=new JMenu("File");
		mb.add(mFile);
		
		miNew=new JMenuItem("new");
		miOpen=new JMenuItem("open");
		miSaveAs=new JMenuItem("save as");
		miExit=new JMenuItem("exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSaveAs);
		mFile.add(miExit);	
		
		content=new JTextArea();
		super.add(content);
		
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSaveAs.addActionListener(this);
		miExit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==miNew){
			content.setText("");
		}else if(e.getSource()==miOpen){
			JFileChooser fileOpen=new JFileChooser();
			int value=fileOpen.showOpenDialog(null);
			
			if(value==0){
				filePath=fileOpen.getSelectedFile().getPath();
				open(filePath);
			}else{
				return;
			}
		}else if(e.getSource()==miSaveAs){
			JFileChooser fileSave=new JFileChooser();
			int saveValue=fileSave.showSaveDialog(null);
			
			if(saveValue==0){
				filePath=fileSave.getSelectedFile().getPath();
				saveAs(filePath);
			}else{
				return;
			}
		}else if(e.getSource()==miExit){
			System.exit(0);
		}
	}
	
	public void saveAs(String filePath){
		File file=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		try{
			file=new File(filePath);
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw,512);
			pw=new PrintWriter(bw);
			
			pw.println(content.getText());
			pw.flush();
		}catch(IOException e){
			System.out.println("FileCloseError");
		}finally{
			try{
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(fw!=null)fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void open(String filePath){
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			file=new File(filePath);
			fr=new FileReader(file);
			br=new BufferedReader(fr,512);
			
			while(true){
				String str=br.readLine();
				if(str==null){
					break;
				}
				content.append(str+"\n");
			}
			
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

public class Exam37 {
	public static void main(String[] args) {
		new MyFile("¸Þ¸ðÀå");
	}
}
