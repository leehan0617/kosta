package ch09;

import java.util.Date;
/*
 * clone(): ������ ������ Ŭ���� �Ұ����� Ŭ������ �ִ�.
 *          api�߿� Cloneable �������̽��� �ִ� Ŭ������ ��������
 * finalize() : ��ü�� �Ҹ�Ǳ����� �ý��� �ڿ��� �����Ѵ�.
 * 				��ü ������ �ϸ� ���������� ������°� �ƴ϶� ������ �÷�����
 *              ���� �������. ���� �����Ϸ��� �������� �ڵ����� ����
 * getClass() : Ŭ���� ������ �˾Ƴ��� ��
 * 				(�ʵ� ����,�޼ҵ� ����,����Ŭ����, Ŭ����..)
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
