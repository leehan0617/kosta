package quiz02;

import java.util.Scanner;
import java.io.IOException;

public class Quiz22 {
	public static void main(String[] ar)throws IOException{
		Scanner sc=new Scanner(System.in);
		int su, value;
		char buho;
		
		do{
			System.out.print("���� �Է��ϼ���:");
			su=sc.nextInt();
			
			System.out.print("��ȣ�� �Է��ϼ���(+, -, *, /) :");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("���� �Է��ϼ���:");
			value=sc.nextInt();
		}while(buho !='+' && buho !='-' && buho !='*' && buho !='/' );
		
		if(buho=='+')
			System.out.println(su + "" + buho + value + "=" + (su+value));
		else if(buho =='-')
			System.out.println(su + "" + buho + value + "=" + (su-value));
		else if(buho =='*')
			System.out.println(su + "" + buho + value + "=" + (su*value));
		else if(buho =='/'){
			if(value==1) value=1;
			System.out.println(su + "" + buho + value + "=" + ((float)su/value));
		}	
		sc.close();
	}
}
