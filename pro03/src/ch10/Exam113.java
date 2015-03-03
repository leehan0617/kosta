package ch10;

/*
 *  LinkedList : �������� �þ���� ������ �ڷᱸ�� 
 *  			 �����͸� �߰��Ҷ� �����ϴ� �ڷᱸ��
 *  			 Stack(LIFO),Queue(FIFO)
 */
import java.util.LinkedList;

public class Exam113 {
	public static void main(String[] args) {
		LinkedList<Integer> stack=new LinkedList<Integer>();
		stack.push(10);		// ==stack.addLast(10);
		stack.addLast(20);
		stack.addLast(30);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
			//==System.out.println(stack.removeLast());
		}
		
		LinkedList<Float> fStack=new LinkedList<Float>();
		fStack.addLast(11.1f);
		fStack.addLast(12.2f);
		fStack.addLast(13.3f);
		System.out.println(fStack.getLast());
		
		fStack.removeLast();
		fStack.addLast(88.8f);
		System.out.println(fStack.getLast());
		System.out.println(fStack.getFirst());
		fStack.removeFirst();
		fStack.addFirst(77.7f);
		
		while(!fStack.isEmpty()){
			System.out.println(fStack.removeLast());
		}
	}
}
