// https://leetcode.com/problems/transpose-matrix/ 

class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] ret = new int[col][row];
        for (int i = 0 ; i < A.length ; i++) {
            for (int j = 0 ; j < A[i].length ; j++) {
                ret[j][i] = A[i][j];
            }
        }
        return ret;        
    }
}