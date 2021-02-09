// https://leetcode.com/problems/construct-quad-tree/

/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution {
    public Node construct(int[][] grid) {
        return quadTreePlanter(grid, 0, 0, grid.length);        
    }
    
    private static Node quadTreePlanter(int[][] grid, int x, int y, int len) {
        if (len == 1) {
            return new Node(grid[x][y] == 1, true, null, null, null, null);
        }

        Node nodeTopLeft = quadTreePlanter(grid, x, y, len/2);
        Node nodeTopRight = quadTreePlanter(grid, x, y+len/2, len/2);
        Node nodeBottomLeft = quadTreePlanter(grid, x+len/2, y, len/2);
        Node nodeBottomRight = quadTreePlanter(grid, x+len/2, y+len/2, len/2);

        if (nodeTopLeft.isLeaf && nodeTopRight.isLeaf && nodeBottomLeft.isLeaf && nodeBottomRight.isLeaf) {
            if (nodeTopLeft.val && nodeTopRight.val && nodeBottomLeft.val && nodeBottomRight.val) {
                return new Node(true, true, null, null, null, null);
            }
            if (!nodeTopLeft.val && !nodeTopRight.val && !nodeBottomLeft.val && !nodeBottomRight.val) {
                return new Node(false, true, null, null, null, null);
            }
        }

        return new Node(true, false, nodeTopLeft, nodeTopRight, nodeBottomLeft, nodeBottomRight);
    }        
}