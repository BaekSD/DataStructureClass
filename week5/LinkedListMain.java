package dataStructure;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.addFirst("A");
		linkedList.addFirst("B");
		linkedList.addFirst("C");
		linkedList.addFirst("D");
		linkedList.addFirst("E");
		linkedList.addFirst("F");
		linkedList.addFirst("G");
		linkedList.addFirst("H");
		linkedList.addFirst("I");
		linkedList.printAllNodes();
		linkedList.addBefore(2, "a");
		linkedList.addBefore(2, "b");
		linkedList.printAllNodes();
		linkedList.addBefore(10, "c");
		linkedList.printAllNodes();
	}
}
