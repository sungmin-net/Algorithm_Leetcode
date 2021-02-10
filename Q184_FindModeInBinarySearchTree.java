// https://leetcode.com/problems/find-mode-in-binary-search-tree/

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
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = null;
        Map<Integer, Integer> map = new HashMap<>();
        while (!stack.isEmpty()) {
            cur = stack.pop();
            if (map.containsKey(cur.val)) {
                map.replace(cur.val, map.get(cur.val) + 1);
            } else {
                map.put(cur.val, 1);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        int maxFreq = 0;
        int curFreq = 0;
        ArrayList<Integer> maxFreqList = null;
        for (int i : map.keySet()) {
            curFreq = map.get(i);
            if (curFreq > maxFreq) {
                maxFreq = curFreq;
                maxFreqList = new ArrayList<Integer>();
                maxFreqList.add(i);
            } else if (map.get(i) == maxFreq) {
                maxFreqList.add(i);
            }
        }
        int len = maxFreqList.size();
        int[] ret = new int[ len ];
        for (int i = 0 ; i < len ; i++) {
            ret[i] = maxFreqList.get(i);
        }
        return ret;
    }
}