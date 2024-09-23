
// Question Link :- https://leetcode.com/problems/reverse-linked-list/?envType=problem-list-v2&envId=linked-list

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; 
        ListNode current = head; 

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev; 
            prev = current; 
            current = nextTemp;
        }

        return prev; 
    }
        
}