package satcksandqueues;

public class Stack {
	Node top;
    int size;
	public Node pop() {
		if (top == null){
            System.out.println("stack is empty");			
			return null;
		}
		else {
			Node temp = new Node(top.value);
			top = top.next;
			size--;
			return temp;
		}
	}

	public void push(Node node) {
		if (node != null) {
			node.next = top;
			top = node;
			size++;
		}
	}
}
