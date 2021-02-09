// https://leetcode.com/problems/n-ary-tree-postorder-traversal/

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
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ret = new ArrayList<Integer>();

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.peek();
//            System.out.println("currentNode : " + node.val);
            if (node.children != null && node.children.size() != 0) {
                for (int i = node.children.size() - 1 ; i >= 0 ; i--) {
                    stack.push(node.children.get(i));
//                    System.out.println("pushed node : " + node.children.get(i).val);
                }
                node.children = null;
            } else if (node.children == null || node.children.size() == 0) {
                ret.add(node.val);
                stack.pop();
//                System.out.println("poped node is : " + node.val);
            }
        }

        return ret;        
    }
}