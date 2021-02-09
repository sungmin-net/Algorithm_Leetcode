// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<List<Integer>>();
        if (root == null) {
            return sol;
        }
        List<TreeNode> cur = new ArrayList<TreeNode>();
        cur.add(root);
        while (cur.size() > 0) {
            List<Integer> row = new ArrayList<Integer>();
            List<TreeNode> next = new ArrayList<TreeNode>();

            for (int i = 0 ; i < cur.size() ; i++) {
                row.add(cur.get(i).val);
                if (cur.get(i).left != null) {
                    next.add(cur.get(i).left);
                }
                if (cur.get(i).right != null) {
                    next.add(cur.get(i).right);
                }
            }
            sol.add(0, row);
            cur = next;
        }

        return sol;        
    }
}