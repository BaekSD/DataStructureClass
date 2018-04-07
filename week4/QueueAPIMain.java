package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAPIMain {

	static Queue q;
	public static void main(String[] args) {
		q = new LinkedList();
		
		enqueue(5);
		enqueue(3);
		dequeue();
		enqueue(7);
		dequeue();
		peek();
		dequeue();
		dequeue();
		System.out.println("isEmpty() : "+q.isEmpty());
	}
	
	public static void enqueue(int i) {
		q.offer(i);
		System.out.println("Output : - Front : " + q.peek());
	}
	
	public static void dequeue() {
		System.out.println("Output : " + q.poll() + " Front : " + q.peek());
	}
	
	public static void peek() {
		System.out.println("Output & Front : " + q.peek());
	}

}
