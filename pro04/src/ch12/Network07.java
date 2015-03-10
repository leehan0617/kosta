package ch12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Network07 {
	public static void main(String[] args) {
		DatagramPacket dp=null; //소포에서의 포장
		DatagramSocket soc=null;
		Scanner scan=null;
		
		try{
			scan=new Scanner(System.in);
			System.out.print("전송할 데이터:");
			String data=scan.nextLine();
			
			InetAddress ia=InetAddress.getByName("192.168.7.208");
			dp=new DatagramPacket(data.getBytes(),data.getBytes().length,ia,12345); //String을 바이트로 변환,데이터의 무게,주소(InetAddress),포트번호
			soc=new DatagramSocket();
			soc.send(dp);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(scan!=null)scan.close();
				if(soc!=null)soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
