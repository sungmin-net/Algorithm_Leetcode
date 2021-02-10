// https://leetcode.com/problems/path-sum/

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if  (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        int val = root.val;
        return hasPathSum(root.left, sum - val) || hasPathSum(root.right, sum - val);
    }
}