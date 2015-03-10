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
			System.out.print("ù��° ���Է�:");
			int input1=scan.nextInt();
			System.out.print("��ȣ �Է�:");
			char ch=(char)System.in.read();
			System.out.print("�ι�° ���Է�:");
			int input2=scan.nextInt();
			
			String data=input1+" "+ch+" "+input2;
			InetAddress ia=InetAddress.getByName("192.168.7.208");
			dp=new DatagramPacket(data.getBytes(), data.getBytes().length,ia,7778);
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
