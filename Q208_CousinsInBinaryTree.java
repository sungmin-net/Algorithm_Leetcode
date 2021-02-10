// https://leetcode.com/problems/cousins-in-binary-tree/

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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level1 = -1;
        int level2 = -1;
        int curLevel = -1;
        while (!queue.isEmpty()) {
            curLevel++;
            int size = queue.size();
            for (int i = 0 ; i < size ; i++) {
                TreeNode node = queue.poll();
                if (node.left != null && node.right != null) {
                    if (node.left.val == x && node.right.val == y) {
                        return false;
                    }
                    if (node.left.val == y && node.right.val == x) {
                        return false;
                    }
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.val == x) {
                    level1 = curLevel;
                }
                if (node.val == y) {
                    level2 = curLevel;
                }
            }
            if (level1 > 0 && level2 == level1) {
                return true;
            }
        }
        return false;
    }
}