package ch12;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam140 {
	public static void main(String[] args) {
		InetAddress local;
		
		try {
			local =InetAddress.getLocalHost(); //주소 받아오기
			System.out.println("my address:"+local.getHostAddress());
			System.out.println("my name:"+local.getHostName());
			
			InetAddress b=InetAddress.getByName("www.naver.com");
			System.out.println("address:"+b.getHostAddress());
			System.out.println("name:"+b.getHostName());
			
			InetAddress[] c=InetAddress.getAllByName("www.daum.net"); //모든 주소 알아내기
			for(int i=0;i<c.length;i++){
				System.out.println("address:"+c[i].getHostAddress());
				System.out.println("name:"+c[i].getHostName());
			}
		} catch (UnknownHostException e) {
			System.out.println("해당 주소가 없습니다.");
			e.printStackTrace();
		}
	}
}
