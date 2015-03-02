package quiz07;

import java.util.StringTokenizer;

public class Quiz13 {
	public static void main(String[] args) {
		String str="I am learning Java Show me to use StringTokenizer";
		
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			System.out.println();
		}
		System.out.println();
		
	}

}
