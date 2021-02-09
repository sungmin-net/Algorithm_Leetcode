// https://leetcode.com/problems/increasing-order-search-tree/

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
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        ArrayList<Integer> data = new ArrayList<Integer>();
        // inorder traversal needs 2 while statements
        while (cur != null || stack.size() > 0) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            data.add(cur.val);
            cur = cur.right;
        }

        // build right skew tree
        TreeNode ret = new TreeNode(data.get(0));
        cur = ret;
        for (int i = 1 ; i < data.size() ; i++) {
            TreeNode t = new TreeNode(data.get(i));
            cur.right = t;
            cur = t;
        }

        return ret;        
    }
}