// https://leetcode.com/problems/search-in-a-binary-search-tree/ 

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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root != null && root.val == val) {
            return root;
        }        
        if (root.left != null) {
            TreeNode result = searchBST(root.left, val);
            if (result != null) {
                return result;
            }
        }
        if (root.right != null) {
            TreeNode result = searchBST(root.right, val);
            if (result != null) {
                return result;
            }
        }

        return null;
    }
}