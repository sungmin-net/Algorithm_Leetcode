// https://leetcode.com/problems/trim-a-binary-search-tree/

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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode ret = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode popedNode = stack.pop();
//            System.out.println("popedNode : " + popedNode.val);
            if (popedNode.val >= L && popedNode.val <= R) {
                if (ret == null) {
                    ret = new TreeNode(popedNode.val);
                } else {
                    TreeNode temp = ret;
                    while (temp != null) {
                        if (temp.val <= popedNode.val) {
                            if (temp.right == null) {
                                temp.right = new TreeNode(popedNode.val);
                                break;
                            } else {
                                temp = temp.right;
                            }
                        } else {
                            if (temp.left == null) {
                                temp.left = new TreeNode(popedNode.val);
                                break;
                            } else {
                                temp = temp.left;
                            }
                        }
                    }
                }
//                System.out.println(Util.toString(ret));
            }
            if (popedNode.right != null) {
                stack.push(popedNode.right);
            }
            if (popedNode.left != null) {
                stack.push(popedNode.left);
            }
        }

        return ret;        
        
    }
    
}