package ch10;

import java.util.LinkedList;

public class Exam115 {
	public static void main(String[] args) {
		AA a=new AA(10,20);
		AA b=new AA(30,40);
		AA c=new AA(55,34);
		AA d=new AA(34,32);
		
		LinkedList<AA> stack=new LinkedList<AA>();
		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.push(d);
		
		while(!stack.isEmpty()){
			AA ab=stack.pop();
			ab.yonsan();
			ab.disp();
		}
		
		System.out.println("=========================");
		
		LinkedList<AA> queue=new LinkedList<AA>();
		queue.offer(a);
		queue.offer(b);
		queue.offer(c);
		queue.offer(d);
		
		while(!queue.isEmpty()){
			AA ab=queue.poll();
			ab.yonsan();
			ab.disp();
		}
	}

}
