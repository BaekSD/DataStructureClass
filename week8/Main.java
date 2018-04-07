package dataStructure.chapter8.pq;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ListPQ pq = new ListPQ(100);
		pq.insert(3, "은애천");
		pq.insert(2, "정혁준");
		pq.insert(1, "장범석");
		pq.insert(6, "김성민");
		pq.insert(4, "박성훈");
		pq.insert(5, "손영석");
		pq.printAll();
		pq.min();
		pq.printAll();
		pq.removeMin();
		pq.printAll();
		pq.removeMin();
		pq.printAll();
		*/
		
		CBTree cbtree = new CBTree(5, "5");
		cbtree.add(7, "7");
		cbtree.add(4, "4");
		cbtree.add(10, "10");
		cbtree.add(3, "3");
		cbtree.add(8, "8");
		cbtree.add(2, "2");
		cbtree.add(1, "1");

		cbtree.preorder();
		cbtree.remove();
		cbtree.preorder();
		cbtree.remove();
		cbtree.preorder();
		cbtree.remove();
		cbtree.preorder();
	}

}
