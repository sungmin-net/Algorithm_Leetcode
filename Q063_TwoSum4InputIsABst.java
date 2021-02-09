// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        ArrayList<Integer> nodeValues = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
//            System.out.println("cur : " + cur.val);
            nodeValues.add(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
//        System.out.println("data : " + nodeValues);
        for (int i = 0 ; i < nodeValues.size() ; i++) {
            int t = k - nodeValues.get(i);
            for (int j = i + 1 ; j < nodeValues.size() ; j++) {
                if (nodeValues.get(j) == t) {
                    return true;
                }
            }
        }
        return false;                
    }
}