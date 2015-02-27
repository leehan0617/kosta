package ch09;

public class Exam98 {
	public static void main(String[] args) {
		String x=new String("APPLE");
		String y=new String("apple");
		
		if(x.equals(y)){
			System.out.println("a==b");
		}else{
			System.out.println("a!=b");
		}
		
		if(x.equalsIgnoreCase(y)){
			System.out.println("a==b");
		}else{
			System.out.println("a!=b");
		}
		
		System.out.println("-----------------------");
		
		String str1="hi"; //내부적으로 컴파일러가 객체생성
		String str2="hi";
		
		if(str1==str2){
			System.out.println("str1==str2");
		}else{
			System.out.println("str1!=str2");
		}
		
		String a=new String("apple");
		String b=new String("apple");
		
		if(a==b){
			System.out.println("a==b");
		}else{
			System.out.println("a!=b");
		}
		
		if(a.equals(b)){
			System.out.println("a==b");
		}else{
			System.out.println("a!=b");
		}
	}
}
