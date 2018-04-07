package dataStructure.binTree;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.getRoot().addLeftChild("1. Mammal");
		tree.getRoot().addRightChild("2. Birds");
		tree.getRoot().getLeftChild().addLeftChild("1-1. Dog");
		tree.getRoot().getLeftChild().addRightChild("1-2. Cat");
		tree.getRoot().getRightChild().addLeftChild("2-1. Sparrow");
		tree.getRoot().getRightChild().addRightChild("2-2. Eagle");
		tree.getRoot().printData();
		tree.getRoot().getRightChild().printData();
		tree.getRoot().getRightChild().getRightChild().printData();
		tree.getRoot().getLeftChild().getRightChild().printData();
		System.out.println();
		System.out.println("preorder");
		tree.preOrder(tree.getRoot());
		System.out.println();
		System.out.println("postorder");
		tree.postOrder(tree.getRoot());
		System.out.println();
		System.out.println("depth of root-left-right");
		System.out.println(depth(tree, tree.getRoot().getLeftChild().getRightChild()));
		System.out.println("depth of root");
		System.out.println(depth(tree, tree.getRoot()));
		System.out.println();
		System.out.println("height1 : root's height");
		System.out.println(height1(tree));
		System.out.println();
		System.out.println("height2 : root");
		System.out.println(height2(tree, tree.getRoot()));
		System.out.println("height2 : root-left");
		System.out.println(height2(tree, tree.getRoot().getLeftChild()));
		System.out.println("height2 : root-left-right");
		System.out.println(height2(tree, tree.getRoot().getLeftChild().getRightChild()));
	}

	/*
	 * below three methods are getting depth and height
	 * in the class(course) reference, these methods are static
	 * so I created this methods in main class.
	 */
	
	public static int depth(Tree t, Node v) {		//get the depth of particular node.
		if(v.isRoot())
			return 0;
		else
			return (depth(t, v.getParent()) + 1);
	}
	
	public static int height1(Tree t) {			//get the height of root of tree.
		int h=0;
		for(Node v : t.nodes())
			if(v.isExternal())
				h = Math.max(h, depth(t, v));
		return h;
	}
	
	public static int height2(Tree t, Node v) {		//get the height of particular node.
		if(v.isExternal())
			return 0;
		int h=0;
		for(Node w : t.children(v))
			h = Math.max(h, height2(t, w));
		return h+1;
	}
}
