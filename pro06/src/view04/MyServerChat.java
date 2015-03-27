package view04;

import java.net.ServerSocket;

public class MyServerChat {
	public static void main(String[] args) {
		try{
			ServerSocket serverSoc=new ServerSocket(8282);
			ServerChat server=new ServerChat("bbb",serverSoc);
			
			Thread th=new Thread(server);
			th.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
