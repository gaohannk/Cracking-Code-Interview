package treeandgraph;

public class GraphNode {
	int val;
	GraphNode next;
	GraphNode[] neighbors;
	boolean visited;

	GraphNode(int x) {
		val = x;
	}

	public String toString() {
		return " value : " + this.val;
	}
}
