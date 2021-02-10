// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

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
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        return sumRootToLeafDfs(root, 0);                
    }
    
    private static int sumRootToLeafDfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = (sum * 2) + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return sumRootToLeafDfs(root.left, sum) + sumRootToLeafDfs(root.right, sum);
    }        
}