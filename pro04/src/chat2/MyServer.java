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
			System.out.println("서버 채팅 준비중...");
			
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
				System.out.println("클라이언트가 나감");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}