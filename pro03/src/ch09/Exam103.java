package ch09;

import java.util.StringTokenizer;

public class Exam103 {
	public static void main(String[] args) {
		StringTokenizer stok1=new StringTokenizer("개구리 왕눈이 아로미 투투");
		
		while(stok1.hasMoreTokens()){
			System.out.println(stok1.nextToken());
		}
		System.out.println();
		
		StringTokenizer stok2=new StringTokenizer("개구리,왕눈이,아로미,투투",",");
		while(stok2.hasMoreTokens()){
			System.out.println(stok2.nextToken());
		}
		
		String[] array=new String[]{"apple","banana"};
		String value="";
		for(int i=0;i<array.length;i++){
			value+=array[i]+",";
		}
		StringTokenizer stok3=new StringTokenizer(value,",");
		while(stok3.hasMoreTokens()){
			System.out.println(stok3.nextToken());
		}
		
		System.out.println("---------------");
		
		String source1="1,kim,90,90|2,park,100,100|3,lee,70,70";
		StringTokenizer str1=new StringTokenizer(source1, "|");
		
		//trim()뒷부분 공백제거 함수
		while(str1.hasMoreTokens()){
			String source2=str1.nextToken();
			StringTokenizer str2=new StringTokenizer(source2,",");
			while(str2.hasMoreTokens()){
				System.out.print(str2.nextToken().trim() + "\t");
			}
			System.out.println();
		}
		
		String str="apple, banana, melon";
		String[] arr=str.split(",");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].trim() + "\t");
		}
		System.out.println();
	}
}
