// https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode prev = null;
        ListNode cur = null;
        ListNode node = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            // reverve
            prev = cur;
            cur = node;
            node = node.next;
            cur.next = prev;
        }
        head = cur;
        if (fast != null) {
            node = node.next;
        }
        while (node != null) {
            if (node.val != head.val) {
                return false;
            }
            head = head.next;
            node = node.next;
        }

        return true;
    }
}