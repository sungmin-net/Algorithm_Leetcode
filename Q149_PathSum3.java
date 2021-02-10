// https://leetcode.com/problems/path-sum-iii/

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
    int pathSum = 0;
    public int pathSum(TreeNode root, int sum) {
        // not mine. I couldn't solve this. another's best solution.
        if (root == null) {
            return 0;
        }
        pathSumHelper(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return pathSum;
    }
    
    public void pathSumHelper(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if (sum - root.val == 0) {
            pathSum++;
        }
        pathSumHelper(root.left, sum - root.val);
        pathSumHelper(root.right, sum - root.val);
    }
}