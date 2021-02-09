// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node poped = stack.pop();
            ret.add(poped.val);
            if (poped.children != null && poped.children.size() != 0) {
                for (int i = poped.children.size() - 1 ; i >= 0 ; i--) {
                    // System.out.println("i : " + i);
                    stack.push(poped.children.get(i));
                }
            }
        }
        return ret;                
    }
}