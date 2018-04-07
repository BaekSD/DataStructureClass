
public class Main {
	public static void main(String[] args) {
		/*Vertex<String> vertex = new Vertex<>("test");
		vertex.addEdge("B");
		vertex.addEdge("C");
		vertex.printEdgeList();*/
		
		/*Graph<String> graph = new Graph<>();
		graph.addVertex("0");
		graph.addVertex("1");
		graph.addVertex("2");
		graph.addVertex("3");
		graph.addVertex("4");
		graph.addVertex("5");
		graph.addVertex("6");
		graph.addVertex("7");
		graph.addVertex("8");
		graph.printVertices();*/
		
		/*Graph<String> graph = new Graph<String>();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		
		graph.findVertex("C",true);

		graph.addEdge("A", "B");	//1
		graph.addEdge("A", "C");	//2
		graph.addEdge("B", "C");	//3
		
		graph.printGraph();*/
		
		Graph<String> graph = new Graph<>();
		graph.addVertex("0");
		graph.addVertex("1");
		graph.addVertex("2");
		graph.addVertex("3");
		graph.addVertex("4");
		graph.addVertex("5");
		graph.addVertex("6");
		graph.addVertex("7");
		graph.printVertices();

		graph.addEdge("0", "2");
		graph.addEdge("0", "3");
		graph.addEdge("0", "4");
		graph.addEdge("1", "3");
		graph.addEdge("1", "6");
		graph.addEdge("2", "5");
		graph.addEdge("3", "7");
		graph.addEdge("4", "7");
		graph.addEdge("5", "6");
		graph.addEdge("6", "7");
		
		graph.printGraph();
		
		graph.depthFirstSearch();
		
		graph.breadthFirstSearch("0");
	}
}
