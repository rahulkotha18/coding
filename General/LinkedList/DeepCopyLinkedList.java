
/**
 * Deep copy a linked list
 * 
 * @author priyanka.debnath
 *
 */

public class DeepCopyLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l12.next = l13;
		l11.next = l12;

		ListNode result = copy(l11);
		System.out.println(result);

	}

	public static ListNode copy(ListNode node) {
		if (node == null)
			return null;
		ListNode copy = new ListNode(node.val);
		copy.next = copy(node.next);
		return copy;
	}

}
