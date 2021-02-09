// https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if ((nums.length * nums[0].length) != (r * c)) {
            return nums;
        }
        int ret[][] = new int[r][c];
        int newR = 0;
        int newC = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = 0 ; j < nums[0].length ; j++) {
                ret[newR][newC++] = nums[i][j];
                if (newC >= c) {
                    newR++;
                    newC = 0;
                }
            }
        }
        return ret;
    }
}