package ch12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Network10 {
	public static void main(String[] args) {
		DatagramPacket dp=null;
		DatagramSocket soc=null;
		byte[] by=new byte[65536];
		
		try{
			System.out.println("서버준비중");
			
			//입력
			dp=new DatagramPacket(by, by.length);
			soc=new DatagramSocket(7777);
			soc.receive(dp);
			
			String str=new String(dp.getData()).trim();
			
			String data="";
			SimpleDateFormat sdf=null;
			if(str.equals("time")){
				sdf=new SimpleDateFormat("HH:mm:ss");
				data=sdf.format(new Date());
			}else if(str.equals("data")){
				sdf=new SimpleDateFormat("yyyy-MM-dd");
				data=sdf.format(new Date());
			}else if(str.equals("datetime")){
				sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				data=sdf.format(new Date());
			}else{
				data="잘못입력하였습니다.";
			}
			
			//출력
			dp=new DatagramPacket(data.getBytes(), data.getBytes().length,dp.getAddress(),7778);
			soc.send(dp);			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(soc!=null) soc.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
