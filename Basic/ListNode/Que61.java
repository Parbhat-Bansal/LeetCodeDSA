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


// Question link :- https://leetcode.com/problems/rotate-list/description/?envType=problem-list-v2&envId=linked-list



class Solution {
    public ListNode rotateRight(ListNode head, int k) {

         if (head == null || head.next == null || k == 0) 
        {
            return head;
        }

        ListNode oldTail = head;
        int length = 1;

        while (oldTail.next != null) 
        {
            oldTail = oldTail.next;
            length++;
        }

        oldTail.next = head;

        k = k % length;
        if (k == 0) 
        {
            oldTail.next = null;  
            return head;
        }

        
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) 
        {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        
        newTail.next = null;

        return newHead;
    }
}