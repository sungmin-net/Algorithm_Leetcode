// https://leetcode.com/problems/sum-of-left-leaves/

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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ret = 0;
        Stack<NodeWrapper> stack = new Stack<NodeWrapper>();
        stack.push(new NodeWrapper(root, false));
        while (!stack.isEmpty()) {
            NodeWrapper cur = stack.pop();
            if (cur.isLeft && cur.node.left == null && cur.node.right == null) {
                ret += cur.node.val;
            }
            if (cur.node.right != null) {
                stack.push(new NodeWrapper(cur.node.right, false));
            }
            if (cur.node.left != null) {
                stack.push(new NodeWrapper(cur.node.left, true));
            }
        }
        return ret;
    }
    private static class NodeWrapper {
        TreeNode node;
        boolean isLeft = false;
        public NodeWrapper(TreeNode node, boolean isLeft) {
            this.node = node;
            this.isLeft = isLeft;
        }
    }    
}