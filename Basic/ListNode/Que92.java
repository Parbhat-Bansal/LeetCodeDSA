

// Question Link :- https://leetcode.com/problems/reverse-linked-list-ii/

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) 
        {
            return head;
        }

        ListNode L1 = new ListNode(0);
        L1.next = head;
        ListNode L2 = L1;

        for (int i = 1 ; i < left ; i++) 
        {
            L2 = L2.next;
        }

        ListNode Start = L2.next;
        ListNode End = Start.next;

        for (int i = 0; i < right - left; i++) 
        {
            Start.next = End.next;
            End.next = L2.next;
            L2.next = End;
            End = Start.next;
        }

        return L1.next;
    }
}
