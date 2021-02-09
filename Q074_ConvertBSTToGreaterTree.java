// https://leetcode.com/problems/convert-bst-to-greater-tree/

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
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        int sum = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || stack.size() > 0) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.right;
            }

            cur = stack.pop();
            cur.val += sum;
            sum = cur.val;
            cur = cur.left;
        }
        return root;
    }
}