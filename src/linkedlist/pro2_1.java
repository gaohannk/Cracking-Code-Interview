package linkedlist;

/* problem 2 Implement an algorithm to find the kth to last element of a singly linked list
 * method 1  the linked list size is known
 * method 2 recusive
 * method 3 iterative keep two pointer and p1 at the beginning,p2 moving k nodes into the list 
 * 
 */

public class pro2_1 {
	public int nthtolast(LinkListNode head, int n) {
		if (head == null) {
			return 0;
		}
		int i = nthtolast(head.next, n) + 1;
		if (i == n) {
			System.out.println(head.value);
		}
		return i;
	}
}
