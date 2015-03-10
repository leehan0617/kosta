package quiz12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.StringTokenizer;

public class Quiz06_2 {
	static double result;
	public static void main(String[] args) {
		DatagramPacket dp=null;
		DatagramSocket soc=null;
		byte[] by=new byte[65536];
		
		try{
			System.out.println("서버준비중");
			
			//입력
			dp=new DatagramPacket(by, by.length);
			soc=new DatagramSocket(7778);
			soc.receive(dp);
			
			String str=new String(dp.getData()).trim();
			StringTokenizer st=new StringTokenizer(str," ");
			String[] array=new String[3];
			int count=0;
			int num1,num2;
			char buho;
			
			while(st.hasMoreTokens()){
				array[count]=st.nextToken();
				count++;
			}
			num1=Integer.parseInt(array[0]);
			num2=Integer.parseInt(array[2]);
			buho=array[1].charAt(0);
			
			
			switch(buho){
			case '+': result=num1+num2;
				break;
			case '-': result=num1-num2;
				break;
			case '*': result=num1*num2;
				break;
			case '/': result=(double)num1/num2;
				break;
			}
						
			String data="사칙연산 결과는:"+result;
			//출력
			dp=new DatagramPacket(data.getBytes(), data.getBytes().length,dp.getAddress(),6666);
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
