package multiChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try{
			serverSocket=new ServerSocket(7878);
			System.out.println("서버작동중");
			
			while(true){
				Socket socket=serverSocket.accept();
				ServerArray array=new ServerArray(socket);
				array.start();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
