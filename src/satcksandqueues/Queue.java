package satcksandqueues;

public class Queue {
     Node first, last;
     int size;
     public void enqueue(Node node){
    	 if (first==null){
    		 first = node;
    		 last = first;
    	 }else{
    		 last.next=node;
    		 last = node;
    	 }
    	 size++;
     }
     public Node dequeue(){
    	 if (first == null){
    		System.out.println("queue is empty");
    		return null; 
    	 }else{
             Node temp = new Node(first.value);    		 
    		 first= first.next;
    		 size--;
    		 return temp;
    	 }
     }
}
