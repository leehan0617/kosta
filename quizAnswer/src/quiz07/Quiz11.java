package quiz07;

class Delete{
	public static String delChar(String str, String delStr){
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++){
			char strCh=str.charAt(i);
			if(delStr.indexOf(strCh)==-1){			// 포함되지 않으면 -1
				sb.append(strCh);
			}
		}
		return sb.toString();
	}
}

public class Quiz11 {
	public static void main(String[] args) {
		System.out.println(Delete.delChar("1!2@3^4~5", "!@^~"));
		System.out.println(Delete.delChar("1\t2\n345", "\t\n"));
	}
}








