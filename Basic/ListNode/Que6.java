
// Question Link :- https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         int totalNodes = 0;
        ListNode current = head;
        while (current != null) {
            totalNodes++;
            current = current.next;
        }
        
        int positionToRemove = totalNodes - n;
        
        if (positionToRemove == 0) {
            return head.next;
        }
        
        current = head;
        for (int i = 1; i < positionToRemove; i++) {
            current = current.next;
        }
        
        current.next = current.next.next;
        
        return head;
        
    }
}