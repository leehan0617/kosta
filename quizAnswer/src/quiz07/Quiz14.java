package quiz07;


import java.util.StringTokenizer;

public class Quiz14 {
	public static void main(String[] args) {
		String str="자바가, 수업, 보이는, KOSTA";
		StringTokenizer st=new StringTokenizer(str, ",");
		
		String[] array=new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()){
			array[i]=st.nextToken();
			i++;
		}
		
		System.out.println(array[0] + "" + array[2] + "" + array[1] + "" + array[3]);
		
		String a="How are you?";
		System.out.println(a.indexOf("a")+1);


	}
}
