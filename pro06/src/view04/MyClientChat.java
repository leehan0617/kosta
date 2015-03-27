package view04;

import java.net.Socket;

public class MyClientChat {
	public static void main(String[] args) {
		try{
			Socket socket=new Socket("192.168.7.208",8282);
			ClientChat client=new ClientChat("nickname",socket);
			
			Thread th=new Thread(client);
			th.start();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("MyClientChat Error");
		}
		
	}
}
