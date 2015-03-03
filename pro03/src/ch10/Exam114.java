package ch10;

import java.util.LinkedList;

public class Exam114 {
	public static void main(String[] args) {
		LinkedList<Integer> queue=new LinkedList<Integer>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		while(!queue.isEmpty()){
			System.out.print(queue.poll() + "\t");
		}
		
		LinkedList<Float> fQueue=new LinkedList<Float>();
		fQueue.offer(0.5f);
		fQueue.offer(0.7f);
		fQueue.offer(0.9f);
		fQueue.offer(1.1f);
		fQueue.offer(1.4f);
		
		fQueue.removeFirst();
		fQueue.addFirst(77.7f);
		
		fQueue.removeLast();
		fQueue.addLast(88.8f);
		while(!fQueue.isEmpty()){
			System.out.println(fQueue.poll());
		}
		
	}

}
