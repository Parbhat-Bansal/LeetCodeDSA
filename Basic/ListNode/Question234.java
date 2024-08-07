

// Question Link :- https://leetcode.com/problems/palindrome-linked-list/description/

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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode reversedHead = null;
        ListNode current = head;

        while (current != null) {
            ListNode newNode = new ListNode(current.val);
            newNode.next = reversedHead;
            reversedHead = newNode;
            current = current.next;
        }

        ListNode original = head;
        ListNode reversed = reversedHead;

        while (original != null && reversed != null) {
            if (original.val != reversed.val) {
                return false;
            }
            original = original.next;
            reversed = reversed.next;
        }

        return true;
    }
        
    
}