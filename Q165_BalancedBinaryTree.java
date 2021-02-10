// https://leetcode.com/problems/balanced-binary-tree/

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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode cur;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            int right = getHeightBinTree(cur.right);
            int left = getHeightBinTree(cur.left);
//            System.out.println(cur.val + ", " + right + ", " + left);

            if (Math.abs(left - right) > 1) {
                return false;
            }

            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }

        }
        return true;
    }
    private static int getHeightBinTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(getHeightBinTree(root.left), getHeightBinTree(root.right)) + 1;
    }    
}