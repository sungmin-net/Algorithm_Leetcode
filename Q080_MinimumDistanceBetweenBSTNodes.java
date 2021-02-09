// https://leetcode.com/problems/minimum-distance-between-bst-nodes/

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
    public int minDiffInBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int prev = -999999999;
        int minDiff = Integer.MAX_VALUE;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();

            //System.out.println(cur.val + ", " + prev + ", " + (cur.val - prev));
            minDiff = Math.min(cur.val - prev, minDiff);
            prev = cur.val;
            cur = cur.right;
        }
        return minDiff;
    }
}