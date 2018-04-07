package dataStructure.chapter8.pq;

public class CBTree {
	private Node root;
	private int n;
	private Node lastNode;
	
	public CBTree(int key, Object data) {
		root = new Node(new Entry(key, data), null);
		n = 1;
		lastNode = null;
	}
	
	public CBTree() {
		root = null;
		n = 0;
		lastNode = null;
	}
	
	public void preorder() {
		System.out.println("==preorder==");
		preorder(root);
	}
	
	public void inorder() {
		System.out.println("==inorder==");
		inorder(root);
	}
	
	private void preorder(Node t) {
		t.printElement();
		if(t.isLeft())
			preorder(t.getLeftChild());
		if(t.isRight())
			preorder(t.getRightChild());
	}
	
	private void inorder(Node t) {
		if(t.isLeft())
			inorder(t.getLeftChild());
		t.printElement();
		if(t.isRight())
			inorder(t.getRightChild());
	}
	
	public Node add(int key, Object data) {
		n++;
		
		Entry addEntry = new Entry(key, data);
		Node tmp = root;
		int j=1;
		
		while(j<=n)
			j*=2;
		j/=4;
		
		for(; j>1; j/=2) {
			if((n/j)%2 == 0)
				tmp = tmp.getLeftChild();
			else
				tmp = tmp.getRightChild();
		}
		
		if(n%2 == 0) {
			tmp.addLeftChild(addEntry);
			tmp = tmp.getLeftChild();
		}
		else {
			tmp.addRightChild(addEntry);
			tmp = tmp.getRightChild();
		}
		
		lastNode = tmp;
		
		return tmp;
	}
	
	public Object remove() {
		n--;
		
		Object element = lastNode.getElement();
		if(lastNode.getParent().getLeftChild() == lastNode)
			lastNode.getParent().removeLeft();
		else
			lastNode.getParent().removeRight();

		Node tmp = root;
		int j=1;
		
		while(j<=n)
			j*=2;
		j/=4;
		
		for(; j>=1; j/=2) {
			if((n/j)%2 == 0)
				tmp = tmp.getLeftChild();
			else
				tmp = tmp.getRightChild();
		}
		
		lastNode = tmp;
		
		return element;
	}
}
