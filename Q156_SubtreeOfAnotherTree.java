// https://leetcode.com/problems/subtree-of-another-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(s);
        TreeNode cur = null;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            if (cur.val == t.val) {
                // start
                if (isSubTreeHelper(cur, t)) {
                    return true;
                }
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return false;                
    }

    public static boolean isSubTreeHelper(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
    return isSubTreeHelper(s.left, t.left) && isSubTreeHelper(s.right, t.right);
    }
}