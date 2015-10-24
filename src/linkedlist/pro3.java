package linkedlist;
/* problem 3 implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 * can't delete the last node
 */

public class pro3 {
	public static boolean deleteNode(LinkListNode node){
		if(node==null||node.next==null)
			return false;
		LinkListNode next= node.next;
		node.value=next.value;
		node.next=next.next;
		return true;
	}
}
