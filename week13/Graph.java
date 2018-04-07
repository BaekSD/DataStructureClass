import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {
	private int numVertex = 0;
	private int numEdge = 0;
	private ArrayList<Vertex<T>> vertexList = new ArrayList<>();
	private ArrayList<T> visited = new ArrayList<>();
	
	public void addVertex(T ele) {
		vertexList.add(new Vertex<T>(ele));
		numVertex++;
	}
	
	public void printVertices() {
		System.out.println("=======printVertices=======");
		for(Vertex<T> vertex:vertexList) {
			System.out.print(vertex.getElement()+" ");
		}
		System.out.println();
	}
	
	public Vertex<T> findVertex(T ele, Boolean print) {
		for(Vertex<T> vertex:vertexList) {
			if(vertex.getElement().equals(ele)) {
				if(print)
					System.out.println("Vertex found "+ele);
				return vertex;
			}
		}
		return null;
	}
	
	public void addEdge(T t1, T t2) {
		findVertex(t1,false).addEdge(t2);
		findVertex(t2,false).addEdge(t1);
	}
	
	public void printGraph() {
		System.out.println("=======printGraph=======");
		for(Vertex<T> vertex:vertexList) {
			vertex.printEdgeList();
		}
	}
	
	public void depthFirstSearch(T ele) {
		Vertex<T> find = this.findVertex(ele, false);
		System.out.println(find.getElement());
		visited.add(find.getElement());
		Iterator<T> iter = find.getEdgeList().iterator();
		while(iter.hasNext()) {
			T e = iter.next();
			if(!visited.contains(e)) {
				depthFirstSearch(e);
			}
		}
	}
	
	public void depthFirstSearch() {
		visited.clear();
		System.out.println("=============Depth First Search=============");
		this.depthFirstSearch((T)"0");
	}
	
	public void breadthFirstSearch(T ele) {
		Queue <T>q = new <T>LinkedList();
		q.offer(ele);
		visited.clear();
		visited.add(ele);
		System.out.println("=============Breadth First Search=============");
		while(!q.isEmpty()) {
			T temp = q.poll();
			Vertex<T> find = this.findVertex(temp, false);
			System.out.println(find.getElement());
			Iterator<T> iter = find.getEdgeList().iterator();
			
			while(iter.hasNext()) {
				T e = iter.next();
				if(!visited.contains(e)) {
					q.offer(e);
					visited.add(e);
				}
			}
		}
	}
}
