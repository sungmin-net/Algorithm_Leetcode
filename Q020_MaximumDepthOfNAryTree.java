// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        
        if (root.children == null || root.children.size() == 0) {
            return 1;
        }
        
        int childMaxDepth = 0;
        for (Node node : root.children) {
            childMaxDepth = Math.max(childMaxDepth, maxDepth(node));
        }
        return childMaxDepth + 1;
    }
}