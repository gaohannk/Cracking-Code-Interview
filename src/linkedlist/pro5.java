package linkedlist;

public class pro5 {
	public LinkListNode addTwoNumbers(LinkListNode l1, LinkListNode l2) {
		int carry = 0;
		LinkListNode p1 = l1;
		LinkListNode p2 = l2;
		LinkListNode p3 = new LinkListNode(0);
		LinkListNode result = p3;
		while (p1 != null || p2 != null) {
			if (p1 != null) {
				carry += p2.getValue();
				p2 = p2.getNext();
			}
			if (p2 != null) {
				carry += p1.getValue();
				p1 = p1.getNext();
			}
			carry /= 10;
			result.setNext(new LinkListNode(carry % 10));
			result.setNext(result.getNext());
		}
		if (carry == 1) {
			result.setNext(new LinkListNode(1));
		}
		return p3.getNext();

	}
}
