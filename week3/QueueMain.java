public class QueueMain {
	public static void main(String[] args) {
		ArrayQueue aq = new ArrayQueue(5);

		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(5);
		aq.enqueue(6);
		aq.printArrayQueue();
		
		System.out.println();
		aq.dequeue();
		aq.dequeue();
		System.out.println();
		
		aq.printArrayQueue();
		aq.clear();
		
		System.out.println();
		aq.printArrayQueue();
	}
}
