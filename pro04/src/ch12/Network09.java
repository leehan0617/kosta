package ch12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Network09 {
	public static void main(String[] args) {
		DatagramPacket dp=null;
		DatagramSocket soc=null;
		Scanner scan=null;
		
		try{
			scan=new Scanner(System.in);
			System.out.print("�����ϼ���(time,date,datetime)");
			String data=scan.next();
			
			InetAddress ia=InetAddress.getByName("192.168.7.208");
			dp=new DatagramPacket(data.getBytes(), data.getBytes().length,ia,7777);
			soc=new DatagramSocket(6666); //�����ڴ� �����͹������� ��Ʈ��ȣ
			soc.send(dp);
			
			//�ޱ�
			byte[] by=new byte[65536];
			dp=new DatagramPacket(by, by.length);
			soc.receive(dp);
			String str=new String(dp.getData()).trim();
			System.out.println("�������� �� ����:"+str);
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
