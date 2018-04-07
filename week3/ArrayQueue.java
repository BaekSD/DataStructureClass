public class ArrayQueue {
	private int arrayQueue[];
	private int size=0, currentUsed=0;
	
	public ArrayQueue(int size) {
		try {
			if(size <= 0) {
				throw new Exception("size must be bigger than 0");
			}
			arrayQueue = new int[size];
			this.size = size;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("enqueue : there is no free space in enqueue.");
			return;
		}
		
		arrayQueue[currentUsed] = data;
		System.out.println("enqueue : ("+currentUsed+", "+data+")");
		currentUsed++;
	}
	
	public int dequeue() {
		int ret=-99999;
		try {
			if(isEmpty())
				throw new Exception("dequeue : there is no data in queue.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return ret;
		}
		
		ret = arrayQueue[0];
		for(int i=0; i<currentUsed-1; i++) {
			arrayQueue[i] = arrayQueue[i+1];
		}
		
		currentUsed--;
		
		System.out.println("dequeue "+ret);
		
		return ret;
	}
	
	public int front() {
		try {
			if(isEmpty())
				throw new Exception("There is no data in queue.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return -99999;
		}
		
		return arrayQueue[0];
	}
	
	public int size() {
		return currentUsed;
	}
	
	public boolean isFull() {
		if(currentUsed >= size) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(currentUsed == 0) {
			return true;
		}
		return false;
	}
	
	public void clear() {
		currentUsed = 0;
	}
	
	public void printArrayQueue() {
		//System.out.println("현재 원소 개수 : "+currentUsed);
		if(currentUsed==0) {
			System.out.println("no data enqueued");
			return;
		}
		for(int i=0; i<currentUsed; i++) {
			System.out.println("("+i+", "+arrayQueue[i]+")");
		}
	}
}
