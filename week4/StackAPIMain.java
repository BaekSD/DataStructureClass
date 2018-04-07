package dataStructure;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackAPIMain {
	static Stack s;
	public static void main(String[] args) {
		s = new Stack();
		
		push(5);
		push(3);
		pop();
		push(7);
		pop();
		peek();
		pop();
		pop();
		System.out.println("isEmpty() : "+s.isEmpty());
	}
	
	public static void push(int i) {
		s.push(i);
		System.out.print("Output : - ");
		showStack();
	}
	
	public static void pop() {
		try {
			System.out.print("Output : " + s.pop() + " ");
			showStack();
		} catch(EmptyStackException e) {
			System.out.println("error - EmptyStackException");
		}
	}
	
	public static void peek() {
		try {
			System.out.print("Output : " + s.peek() + " ");
			showStack();
		} catch(EmptyStackException e) {
			System.out.println("error - EmptyStackException");
		}
	}
	
	public static void showStack() {
		System.out.print("Stack : ");
		for(int i=0; i<s.size(); i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(s.get(i));
		}
		System.out.println();
	}
}
