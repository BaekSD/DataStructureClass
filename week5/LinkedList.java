package dataStructure;
public class LinkedList {
	
	Node header = new Node();
	Node trailer = new Node();
	
	public LinkedList() {
		header.setNext(trailer);
		trailer.setPrev(header);
	}
	
	public void addFirst(String value) {
		Node nodeNew = new Node(header, header.getNext(), value);
		header.getNext().setPrev(nodeNew);
		header.setNext(nodeNew);
	}
	
	public void addLast(String value) {
		Node nodeNew = new Node(trailer.getPrev(), trailer, value);
		trailer.getPrev().setNext(nodeNew);
		trailer.setPrev(nodeNew);
	}

	public boolean addBefore(int n, String value) {
		Node temp  = header.getNext();
		int index = 0;
		while(temp != trailer) {
			if(index == n) {
				Node nodeNew = new Node(temp.getPrev(), temp, value);
				temp.getPrev().setNext(nodeNew);
				temp.setPrev(nodeNew);
				return true;
			}
			temp = temp.getNext();
			index++;
		}
		return false;
	}

	public boolean addAfter(int n, String value) {
		return addBefore(n-1, value);
	}
	
	public boolean set(int n, String value) {
		Node temp = header.getNext();
		int index = 0;
		while(temp != trailer) {
			if(index == n) {
				temp.setString(value);
				return true;
			}
			temp = temp.getNext();
			index++;
		}
		return false;
	}
	
	public boolean remove(int n) {
		Node temp = header.getNext();
		int index = 0;
		while(temp != trailer) {
			if(index == n) {
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
				return true;
			}
			temp = temp.getNext();
			index++;
		}
		return false;
	}
	
	public Node first() {
		return header.getNext();
	}
	
	public Node last() {
		return trailer.getPrev();
	}
	
	public Node prev(Node p) {
		return p.getPrev();
	}
	
	public Node next(Node p) {
		return p.getNext();
	}
	
	public void printAllNodes() {
		Node temp = header.getNext();
		while(temp != trailer) {
			System.out.print(temp.getString());
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		if(header.getNext() == trailer)
			return true;
		return false;
	}
	
	public int size() {
		int size = 0;
		
		Node temp = header.getNext();
		
		while(temp != trailer) {
			temp = temp.getNext();
			size++;
		}
		return size;
	}
}