// https://leetcode.com/problems/binary-tree-tilt/

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
    public int findTilt(TreeNode root) {
        int[] ret = new int[1];
        findTiltHelper(root, ret);
        return ret[0];
    }
    private static int findTiltHelper(TreeNode node, int[] ret) {
        if (node == null) {
            return 0;
        }
        int l_sum = findTiltHelper(node.left, ret);
        int r_sum = findTiltHelper(node.right, ret);
        ret[0] += Math.abs(l_sum - r_sum);
        return l_sum + r_sum + node.val;
    }    
    
}