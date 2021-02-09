// https://leetcode.com/problems/construct-string-from-binary-tree/

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
    public String tree2str(TreeNode t) {
        StringBuffer buf = new StringBuffer();
        if (t != null) {
            buf.append(t.val);
            boolean isLeftNull = true;
            if (t.left != null) {
                buf.append("(").append(tree2str(t.left)).append(")");
                isLeftNull = false;
            }
            if (t.right != null) {
                if (isLeftNull) {
                    buf.append("()");
                }
                buf.append("(");
                buf.append(tree2str(t.right)).append(")");
            }
        }
        return buf.toString();
    }
}