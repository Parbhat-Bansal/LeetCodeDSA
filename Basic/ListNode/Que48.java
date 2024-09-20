
// Question Link :- https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/?envType=problem-list-v2&envId=linked-list


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) 
            {
                while (curr.next != null && curr.val == curr.next.val)
                {
                    curr = curr.next;
                }

                prev.next = curr.next;
            } 
            
            else 
            {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}