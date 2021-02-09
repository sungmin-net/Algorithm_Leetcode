// https://leetcode.com/problems/leaf-similar-trees/

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<TreeNode> leaves1 = getLeavesFromBinaryTree(root1);
        ArrayList<TreeNode> leaves2 = getLeavesFromBinaryTree(root2);
        return toStringArrayList(leaves1).equals(toStringArrayList(leaves2));
    }
    private static ArrayList<TreeNode> getLeavesFromBinaryTree(TreeNode root){
        if (root == null) {
            return null;
        }
        // let's make it in-order!
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<TreeNode> leaves = new ArrayList<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
//            System.out.println("currentNode : " + currentNode.val);
            if (isLeafNode(currentNode)) {
                leaves.add(currentNode);
            }
            // note! to get left first from the stack, push right first.
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return leaves;
    }

    private static boolean isLeafNode(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
    
    private static ArrayList<String> toStringArrayList(ArrayList<TreeNode> nodes) {
        if (nodes == null || nodes.size() == 0) {
            return null;
        }
        ArrayList<String> ret = new ArrayList<String>();
        for (TreeNode node : nodes) {
            ret.add(String.valueOf(node.val));
        }
        return ret;
    }    
}