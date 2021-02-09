// https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }        
        ListNode cur = head;
        ArrayList<Integer> data = new ArrayList<Integer>();
        while (cur != null) {
            data.add(cur.val);
            cur = cur.next;
        }
        System.out.println("data : " + data);
        ListNode ret = new ListNode(data.get(data.size() - 1));
        cur = ret;
        for (int i = data.size() - 2 ; i >= 0 ; i--) {
            cur.next = new ListNode(data.get(i));
            cur = cur.next;
        }
        return ret;                
    }
}