class Solution{

    public ListNode reverseBetween(ListNode head,int m, int n){
        ListNode temp = head;
        ListNode current = head;
        ListNode prev = null;
        int count = 1;
        ListNode pointer = null
        ListNode iniListTail = null;
        ListNode newListTail = null;

        if(m==n) return head;
        if(current.next == null) return head;

        while(current != null){
            current = current.next
            if (count == m){
                iniListTail = prev;
                newListTail = temp;
            }
            if(m > 1){
                if(count > m && count <= n):
                temp.next = prev;
                pointer = temp;
            }
            else{
                if(count>=m and count<=n)
                temp.next = prev;
                pointer = temp;
            }
            prev = temp;
            temp = current;
            if(m == 1 && count == n){
                head.next = temp;
                return pointer;
            }
            if(m > 1 && count == n && temp != null){
                iniListTail.next = pointer;
                newListTail.next = current;
                return head;
            }

            if(m > 1 && count == n && current == null){
                iniListTail.next = pointer;
                newListTail.next = null;
                return head;
            }
            count++;
        }
        return head;
    }
}