

// Question Link :- https://leetcode.com/problems/reorder-list/description/?envType=problem-list-v2&envId=linked-list


public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;  
        secondHalf = reverseList(secondHalf);

        mergeLists(head, secondHalf);
    }

    private ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) 
        {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private void mergeLists(ListNode first, ListNode second) {
        ListNode firstNext, secondNext;
        while (first != null && second != null) 
        {
            firstNext = first.next;
            secondNext = second.next;

            first.next = second;
            
            if (firstNext == null) 
            {
                break;
            }

            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }
    }
}