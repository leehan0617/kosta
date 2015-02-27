package ch09;

import java.util.Date;
/*
 * clone(): 복제가 가능한 클래스 불가능한 클래스가 있다.
 *          api중에 Cloneable 인터페이스가 있는 클래스만 복제가능
 * finalize() : 객체가 소멸되기전에 시스템 자원을 해제한다.
 * 				객체 생성을 하면 힙영역에서 사라지는게 아니라 가비지 컬렉터의
 *              모듈로 모아진다. 그후 컴파일러가 가비지를 자동으로 제거
 * getClass() : 클래스 정보를 알아내는 것
 * 				(필드 정보,메소드 정보,슈퍼클래스, 클래스..)
 */

class FF implements Cloneable{
	private int x,y;
	
	public FF(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println("x:" + x +"\t" + "y:" + y);
	}
	
	public Object clone(){
		try{
			return super.clone();		
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
}
public class Exam93 {
	public static void main(String[] args) {
		Date d=new Date();
		Date x=(Date)d.clone();
		
		System.out.println("a:"+d);
		System.out.println("x:"+x);
		
		FF f=new FF(10,20);
		FF g=(FF)f.clone();
		f.disp();
		g.disp();
	}
}
