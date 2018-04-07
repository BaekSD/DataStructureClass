package dataStructure.binTree;

import java.util.ArrayList;

public class Tree {
	private Node root;
	
	public Tree() {
		root = new Node("Root", null);
	}
	
	public Tree(Node root) {
		if(root == null) {
			this.root = new Node("Root", null);
		} else {
			this.root = root;
		}
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void preOrder(Node t) {
		t.printData();
		if(t.isLeft())
			this.preOrder(t.getLeftChild());
		if(t.isRight())
			this.preOrder(t.getRightChild());
	}
	
	public void postOrder(Node t) {
		if(t.isLeft())
			this.postOrder(t.getLeftChild());
		if(t.isRight())
			this.postOrder(t.getRightChild());
		t.printData();
	}
	
	public ArrayList<Node> nodes() {			//get the list of tree's nodes
		return descendants(getRoot());
	}
	
	public ArrayList<Node> descendants(Node v) {		//get the list of node's descendants
		ArrayList<Node> nodes = new ArrayList<Node>();
		nodes.add(v);
		if(v.isLeft())
			nodes.addAll(descendants(v.getLeftChild()));
		if(v.isRight())
			nodes.addAll(descendants(v.getRightChild()));
		return nodes;
	}
	
	public ArrayList<Node> children(Node v) {			//get the list of node's descendants without itself
		ArrayList<Node> nodes = new ArrayList<Node>();
		if(v.isLeft())
			nodes.addAll(descendants(v.getLeftChild()));
		if(v.isRight())
			nodes.addAll(descendants(v.getRightChild()));
		return nodes;
	}
}
