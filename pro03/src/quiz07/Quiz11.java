package quiz07;

class Delete{
	public static boolean delChar(String str1,String str2){
		String[] array=new String[str1.length()];
		String[] array2=new String[str2.length()];
		String temp1="";
		
		for(int i=0;i<array.length;i++){
			array[i]=str1.substring(i, i+1);
		}
		for(int i=0;i<array2.length;i++){
			array2[i]=str2.substring(i,i+1);
		}
		
		for(int i=0;i<str2.length();i++){
			if(str1.indexOf(array2[i]) != -1){
				//temp1+=str1.substring(str1.indexOf(array2[i])-1, str1.indexOf(array2[i]));
				temp1.split(str1,str1.indexOf(array2[i]));
			}
		}
		
		System.out.println(temp1);
		return true;
	}
}

public class Quiz11 {
	public static void main(String[] args) {
		System.out.println(Delete.delChar("1!2@3^4~5", "!@^~"));
		System.out.println(Delete.delChar("1\t2\n345", "\t\n"));
	}
}
