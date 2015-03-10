package quiz12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Quiz05_2 {
	public static void main(String[] args) {
		DatagramPacket dp=null;
		DatagramSocket soc=null;
		Scanner scan=null;
		
		try{
			scan=new Scanner(System.in);
			System.out.print("첫번째 수입력:");
			int input1=scan.nextInt();
			System.out.print("부호 입력:");
			char ch=(char)System.in.read();
			System.out.print("두번째 수입력:");
			int input2=scan.nextInt();
			
			String data=input1+" "+ch+" "+input2;
			InetAddress ia=InetAddress.getByName("192.168.7.208");
			dp=new DatagramPacket(data.getBytes(), data.getBytes().length,ia,7778);
			soc=new DatagramSocket(6666); //생성자는 데이터받을때의 포트번호
			soc.send(dp);
			
			//받기
			byte[] by=new byte[65536];
			dp=new DatagramPacket(by, by.length);
			soc.receive(dp);
			String str=new String(dp.getData()).trim();
			System.out.println("서버에서 온 내용:"+str);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(scan!=null) scan.close();
				if(soc!=null)  soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
