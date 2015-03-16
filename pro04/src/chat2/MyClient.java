package chat2;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("이름입력하세요.");
			return;
		}
		
		try{
			Socket socket=new Socket("192.168.7.208",8823);
			ClientMsg cm=new ClientMsg(socket, args[0]);
			cm.start();
			cm.sendMsg();
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
