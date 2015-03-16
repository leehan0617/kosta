package chat2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class MyServer {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(8823);
			System.out.println("���� ä�� �غ���...");
			
			Socket socket=serverSocket.accept();
			ServerMsg sm=new ServerMsg(socket);
			sm.start();
			sm.sendMsg();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				serverSocket.close();
			}catch(SocketException e){
				System.out.println("Ŭ���̾�Ʈ�� ����");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}