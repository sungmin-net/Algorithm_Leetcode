// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/

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
    public int findSecondMinimumValue(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        ArrayList<Integer> data = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            data.add(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
                stack.push(cur.left);
            }
        }
        Collections.sort(data);
        int secSmall = data.get(0);
        for (int i = 1 ; i < data.size() ; i++) {
            if (data.get(i) > secSmall) {
                return data.get(i);
            }
        }

        return -1;                
    }
}