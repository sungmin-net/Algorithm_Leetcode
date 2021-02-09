// https://leetcode.com/problems/binary-tree-paths/

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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ret = new ArrayList<String>();
        if (root == null) {
            return ret;
        }        
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<String> strStack = new Stack<String>();
        nodeStack.push(root);
        strStack.push("");
        while (!nodeStack.isEmpty()) {
            TreeNode curNode = nodeStack.pop();
            String curStr = strStack.pop();

            if (curNode.left == null && curNode.right == null) {
                ret.add(curStr + curNode.val);
            }
            if (curNode.right != null) {
                nodeStack.push(curNode.right);
                strStack.push(curStr + curNode.val +  "->");
            }
            if (curNode.left != null) {
                nodeStack.push(curNode.left);
                strStack.push(curStr + curNode.val + "->");
            }
        }
        return ret;                
    }
}