// https://leetcode.com/problems/merge-two-binary-trees/

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode ret = new TreeNode(0);
        if (t1 != null) {
            addNode(t1, ret);
        }
        if (t2 != null) {
            addNode(t2, ret);
        }
        return ret;
    }
    
    public static void addNode(TreeNode source, TreeNode target) {
        if (source == null || target == null) {
            return;
        }
        target.val = target.val + source.val;
        if (source.left != null) {
            if (target.left == null) {
                target.left = new TreeNode(0);
            }
            addNode(source.left, target.left);
        }
        if (source.right != null) {
            if (target.right == null) {
                target.right = new TreeNode(0);
            }
            addNode(source.right, target.right);
        }
    }
    
}