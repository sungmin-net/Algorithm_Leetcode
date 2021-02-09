// https://leetcode.com/problems/diameter-of-binary-tree/

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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        getBinTreeDiameterReccursive(root, diameter);
        return diameter[0];
    }

    public static int getBinTreeDiameterReccursive(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }

        int leftChildHeight = getBinTreeDiameterReccursive(node.left, diameter);
        int rightChildHeight = getBinTreeDiameterReccursive(node.right, diameter);
        diameter[0] = Math.max(diameter[0], leftChildHeight + rightChildHeight);

        return Math.max(leftChildHeight, rightChildHeight) + 1;
    }
}