
class Solution{
    public ListNode reverseList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null){
            fast = fast.next;
            slow.next = prev;
            prev = slow;
            slow = fast;
        }
        return prev;
    }
}