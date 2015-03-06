package quiz02;

import java.util.Scanner;
import java.io.IOException;

public class Quiz22 {
	public static void main(String[] ar)throws IOException{
		Scanner sc=new Scanner(System.in);
		int su, value;
		char buho;
		
		do{
			System.out.print("수를 입력하세요:");
			su=sc.nextInt();
			
			System.out.print("부호를 입력하세요(+, -, *, /) :");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("수를 입력하세요:");
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
