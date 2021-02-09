// https://leetcode.com/problems/n-ary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        class NodeEx extends Node {
            Node node;
            int level;
            public NodeEx(Node node, int level) {
                this.node = node;
                this.level = level;
            }
        }

        List<NodeEx> data = new ArrayList<NodeEx>();
        

        Queue<NodeEx> Q = new LinkedList<NodeEx>();
        Q.offer(new NodeEx(root, 1));
        while (!Q.isEmpty()) {
            NodeEx cur = Q.poll();
//            System.out.println(cur.node.val);
            data.add(cur);
            if (cur.node.children != null && cur.node.children.size() != 0) {
                for (Node node : cur.node.children) {
                    Q.offer(new NodeEx(node, cur.level + 1));
                }
            }
        }
        int curLevel = data.get(0).level;
        for (NodeEx nodeEx : data) {
            if  (ret.size() == 0 || nodeEx.level != curLevel) {
                ret.add(new ArrayList<Integer>());
            }
            ret.get(ret.size() - 1).add(nodeEx.node.val);
            curLevel = nodeEx.level;
        }

        return ret;
    }
}