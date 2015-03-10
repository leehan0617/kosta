package ch12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Network08 {
	public static void main(String[] args) {
		DatagramPacket dp=null;
		DatagramSocket soc=null;
		byte[] by=new byte[65536];
		
		try{
			System.out.println("서버준비중");
			soc=new DatagramSocket(12345);
			dp=new DatagramPacket(by, by.length);
			
			soc.receive(dp);
			String str=new String(dp.getData());
			System.out.println(str.trim());
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
