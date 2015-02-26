package ch09;

import java.util.Date;

/*
 * java.lang.Object
 * 1)��� Ŭ�������� Object Ŭ���� ��ӹ޴´�.
 * 2)extends ������� ���� �ʾƵ� �����Ϸ��� �ڵ����� Object��
 *   �ڽ�Ŭ���� �����.
 * 3)���(�ʵ�)���� ����.
 * 4)�޼ҵ� :hashCode,wait,notify,notifyAll,toString,equal
 * 			clone,finalize,getClass
 */

/*
 *  toString: ���ڿ��� ��ȯ
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
