package dataStructure.binTree;

public class Node {
	private Object data;
	private Node left;
	private Node right;
	private Node parent;
	
	public Node(Object data, Node parent) {
		this.data = data;
		this.parent = parent;
		left = null;
		right = null;
	}
	
	public Node getLeftChild() {
		return left;
	}
	
	public Node getRightChild() {
		return right;
	}
	
	public void addLeftChild(Object data) {
		Node temp = new Node(data, this);
		this.left = temp;
	}
	
	public void addRightChild(Object data) {
		Node temp = new Node(data, this);
		this.right = temp;
	}
	
	public boolean isLeft() {
		if(getLeftChild() == null)
			return false;
		return true;
	}
	
	public boolean isRight() {
		if(getRightChild() == null)
			return false;
		return true;
	}
	
	public boolean isRoot() {
		if(parent == null)
			return true;
		return false;
	}
	
	public boolean isExternal() {
		if(isLeft() || isRight())
			return false;
		return true;
	}
	
	public boolean isInternal() {
		if(isLeft() || isRight())
			return true;
		return false;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public Object getData() {
		return data;
	}
	
	public void printData() {
		System.out.println(data);
	}
}
