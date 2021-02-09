// https://leetcode.com/problems/average-of-levels-in-binary-tree/

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
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return new ArrayList<Double>();
        }
        Queue<TreeNodeEx> q = new LinkedList<TreeNodeEx>();
        ArrayList<TreeNodeEx> data = new ArrayList<TreeNodeEx>();
        q.offer(new TreeNodeEx(root, 1));
        while (!q.isEmpty()) {
            TreeNodeEx cur = q.poll();
            data.add(cur);
            if (cur.node.left != null) {
                q.offer(new TreeNodeEx(cur.node.left, cur.level + 1));
            }
            if (cur.node.right != null) {
                q.offer(new TreeNodeEx(cur.node.right, cur.level + 1));
            }
        }

        int height = data.get(data.size() - 1).level;
        List<Double> ret = new ArrayList<Double>();
        for (int i = 1 ; i <= height ; i++) {
            double sum = 0;
            int count = 0;
            for (TreeNodeEx nodeEx : data) {
                if (i == nodeEx.level) {
                    sum += nodeEx.node.val;
                    count++;
                }
            }
            ret.add(sum / count);
        }
        return ret;        
    }

    public static class TreeNodeEx {
        TreeNode node;
        int level;
        public TreeNodeEx(TreeNode root, int level) {
            this.node = root;
            this.level = level;
        }

        @Override
        public String toString() {
            StringBuffer buf = new StringBuffer();
            buf.append("node : " + node.val + ", level : " + level + "\n");
            return buf.toString();
        }
    }
}