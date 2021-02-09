// https://leetcode.com/problems/range-addition-ii/

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return n * m;
        }
        if (ops.length == 1) {
            return ops[0][0] * ops[0][1];
        }
        int minRow = ops[0][0];
        int minCol = ops[0][1];
        for (int i = 1 ; i < ops.length ; i++) {
            minRow = Math.min(minRow, ops[i][0]);
            minCol = Math.min(minCol, ops[i][1]);
        }
        return minRow * minCol;                
    }
}