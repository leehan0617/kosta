package multiChat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("이름을 하나 입력하세요.");
			return;
		}
		try{
			Socket socket=new Socket("192.168.7.208",7878);
			CSender s=new CSender(socket,args[0]);
			s.start();

			CReciver r=new CReciver(socket);
			r.start();
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
		}
	}
}
