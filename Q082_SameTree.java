// https://leetcode.com/problems/same-tree/

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        Stack<TreeNode> pStack = new Stack<TreeNode>();
        pStack.push(p);
        Stack<TreeNode> qStack = new Stack<TreeNode>();
        qStack.push(q);
        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            p = pStack.pop();
            q = qStack.pop();
            // System.out.println("p : " + p.val + ", q : " + q.val);
            if (p.val != q.val) {
                return false;
            }
            if (p.right != null) {
                if (q.right == null) {
                    return false;
                }
                pStack.push(p.right);
                qStack.push(q.right);
            } else {
                // p.right == null
                if (q.right != null) {
                    return false;
                }
            }

            if (p.left != null) {
                if (q.left == null) {
                    return false;
                }
                pStack.push(p.left);
                qStack.push(q.left);
            } else {
                // p.left == null
                if (q.left != null) {
                    return false;
                }
            }
        }

        if (pStack.isEmpty() && pStack.isEmpty()) {
            return true;
        }
        return false;
        /* Use call stack
		if(p==null && q == null){
            return true;
        }
        if(p== null  || q == null){
            return false;
        }
        
        if(p.val != q.val){
            return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right , q.right);
         */
    }
}