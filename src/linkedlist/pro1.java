package linkedlist;

// problem1 write  code to remove duplicates from an unsorted linked list
// method 1 use Hashtable  使用哈希表
// method 2 without buffer 使用双重循环

import java.util.*;

public class pro1 {
	public static void removeduplicate(LinkListNode head){
		Hashtable<Integer,Boolean> table= new Hashtable<Integer,Boolean>();
		LinkListNode prev=null;
		LinkListNode curr=head;
		while (curr != null){
			if (table.containsKey(curr.value)){
			     prev.next=curr.next;
			}else{
				table.put(curr.value, true);
				prev=curr;
			}
			curr=curr.next;
		}
	}
}