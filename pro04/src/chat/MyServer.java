package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try{
			serverSocket=new ServerSocket(8823);
			System.out.println("���� ä�� �غ���...");
			
			Socket socket=serverSocket.accept();
			SReciver r=new SReciver(socket);
			r.start();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				serverSocket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}