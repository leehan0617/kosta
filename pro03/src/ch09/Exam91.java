package ch09;

import java.util.Date;

/*
 * java.lang.Object
 * 1)모든 클래스들은 Object 클래스 상속받는다.
 * 2)extends 상속절을 쓰지 않아도 컴파일러가 자동으로 Object의
 *   자식클래스 만든다.
 * 3)멤버(필드)변수 없다.
 * 4)메소드 :hashCode,wait,notify,notifyAll,toString,equal
 * 			clone,finalize,getClass
 */

/*
 *  toString: 문자열로 반환
 */

class AA{
	private int x,y;
	
	public AA(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		String str="x:"+x+"y:"+y;
		return str;
	}
}

public class Exam91 {
	public static void main(String[] args) {
		Integer a=new Integer("10");
		System.out.println(++a);
		
		String b=a.toString();
		System.out.println("b:" + b);
		
		Date d=new Date();
		System.out.println(d.toString());
		
		AA aa=new AA(10,20);
		System.out.println(aa.toString());
	}
}
