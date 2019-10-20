/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * @author Shilak
 *
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		if (l1 == null || l2 == null) {
			result = l1 == null ? l2 : l1;
		} else if (l1 != null && l2 != null) {
			int sum = l1.val + l2.val;
			int carry = sum > 9 ? sum / 10 : 0;
			result = new ListNode(sum % 10);
			ListNode head = result;
			l1 = l1.next;
			l2 = l2.next;
			while (l1 != null || l2 != null || carry > 0) {
				if(l1 != null || l2 != null) {
					if (l1 == null) {
						sum = l2.val + carry;
						l2 = l2.next;
					} else if (l2 == null) {
						sum = l1.val + carry;
						l1 = l1.next;
					} else {
						sum = l1.val + l2.val + carry;
						l1 = l1.next;
						l2 = l2.next;
					}
					carry = sum > 9 ? sum / 10 : 0;
					head.next = new ListNode(sum % 10);
					head = head.next;
				}
				else {
					head.next = new ListNode(carry);
					carry = 0;
				}
			}
		}
		return result;
	}
}