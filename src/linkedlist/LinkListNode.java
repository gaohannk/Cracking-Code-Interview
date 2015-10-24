package linkedlist;

public class LinkListNode {
	public LinkListNode(int i) {
		this.value=i; 
	}
	public int value;
	public LinkListNode next;
	public LinkListNode getNext() {
		return this.next;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value){
		this.value=value;
	}
	public void setNext(LinkListNode next){
		this.next=next;
	}
}
