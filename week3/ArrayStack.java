package dataStructure;

public class ArrayStack {
	private int arrayStack[];
	private int size=0, currentUsed=0;
	
	public ArrayStack(int size) {
		try {
			if(size <= 0) {
				throw new Exception("size must be bigger than 0");
			}
			arrayStack = new int[size];
			this.size = size;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("push : there is no free space in arraystack.");
			return;
		}
		arrayStack[currentUsed] = data;
		System.out.println("push : ("+currentUsed+", "+data+")");
		currentUsed++;
	}
	
	public int pop() {
		int ret = -99999;
		try {
			if(isEmpty())
				throw new Exception("pop : there is no data in stack.");
		} catch(Exception e) {
			//System.out.println(e.getMessage());
			return ret;
		}
		ret = arrayStack[currentUsed-1];
		
		currentUsed--;
		
		System.out.println("pop "+ret);
		
		return ret;
	}
	
	public int top() {
		try {
			if(isEmpty())
				throw new Exception("There is no data in stack.");
		} catch(Exception e) {
			//System.out.println(e.getMessage());
			return -99999;
		}
		
		return arrayStack[currentUsed-1];
	}
	
	public boolean isEmpty() {
		if(currentUsed == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(currentUsed == size) {
			return true;
		}
		return false;
	}
	
	public void clear() {
		currentUsed=0;
	}
	
	public int size() {
		return currentUsed;
	}
	
	public void printArrayStack() {
		//System.out.println("현재 원소 개수 : "+currentUsed);
		if(currentUsed==0) {
			System.out.println("no data pushed");
			return;
		}
		for(int i=0; i<currentUsed; i++) {
			System.out.println("("+i+", "+arrayStack[i]+")");
		}
	}
}
