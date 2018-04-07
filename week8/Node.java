package dataStructure.chapter8.pq;

public class Node {
	private Object element;
	private Node left, right, parent;
	
	public Node(Object element, Node parent) {
		this.element = element;
		this.parent = parent;
	}
	
	public void addLeftChild(Object element) {
		left = new Node(element, this);
	}
	
	public void addRightChild(Object element) {
		right = new Node(element, this);
	}
	
	public void removeLeft() {
		left = null;
	}
	
	public void removeRight() {
		right = null;
	}
	
	public void printElement() {
		System.out.println(element);
	}
	
	public Object getElement() {
		return element;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public Node getLeftChild() {
		return left;
	}
	
	public Node getRightChild() {
		return right;
	}
	
	public boolean isLeft() {
		if(left != null)
			return true;
		return false;
	}
	
	public boolean isRight() {
		if(right != null)
			return true;
		return false;
	}
	
	public boolean isLeaf() {
		if(!isLeft() && !isRight())
			return true;
		return false;
	}
}
