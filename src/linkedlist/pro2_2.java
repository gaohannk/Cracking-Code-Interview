package linkedlist;

public class pro2_2 {
	public LinkListNode nthtolast(LinkListNode head, int n) {
		if (head == null) {
			return null;
		}
		LinkListNode p1 = head;
		LinkListNode p2 = head;
		for (int i = 0; i < n; i++) {
			p2 = p2.next;
		}
		while (p2 != null) {
			p2 = p2.next;
			p1 = p1.next;
		}
		return p1;
	}
}
