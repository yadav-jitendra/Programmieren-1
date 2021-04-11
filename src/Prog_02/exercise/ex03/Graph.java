package ex03;

public class Graph {

	/**
	 * Adds node to graph if node with same name does not already exist
	 * 
	 * @param node node to add
	 * @return true if node added, else otherwise (i.e., node with same name already
	 *         existed)
	 */
	public boolean addNode(Node node) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Adds an edge to the graph if its nodes already exist in the graph, the edge
	 * connects two different nodes, the nodes are not yet connected, and the weight
	 * is positive.
	 * 
	 * @param edge edge to add
	 * @return true if edge added, else otherwise (i.e., violating the above mentioned rules)
	 */
	public boolean addEdge(Edge edge) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Removes the given node.
	 * 
	 * @param node node to remove
	 * @return true if removed, false if it was not inside the graph
	 */
	public boolean removeNode(Node node) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Removes the given edge.
	 * 
	 * @param edge edge to remove
	 * @return true if removed, false if it was not inside the graph
	 */
	public boolean removeEdge(Edge edge) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	/**
	 * Returns the node with the given name if it exists in the graph. Null otherwise.
	 * @param name Name of the node to be returned
	 * @return null if no node with that name exists in the graph.
	 */
	public Node getNode(String name) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Checks whether the graph is connected or not. This means that a path exists
	 * from any node to any other node.
	 * 
	 * @return true if the graph is connected and false otherwise
	 */
	public boolean checkConnectivity() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * @param firstNode the node where to start
	 * @return every node mapped to the edge to reach it
	 */
	public Object calculateShortestPaths(Node firstNode) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

}
