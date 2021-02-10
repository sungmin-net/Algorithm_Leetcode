// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int ret = 0;
        int[][] arr = new int[n][m];
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                if ((arr[i][j] & 1) == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int[] a : indices) {
            int incRow = a[0];
            int incCol = a[1];
            for (int i = 0 ; i < arr.length ; i++) {
                for (int j = 0 ; j < arr[i].length ; j++) {
                    if (i == incRow) {
                        arr[i][j]++;
                    }
                    if (j == incCol) {
                        arr[i][j]++;
                    }
                }
            }
        }
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                if ((arr[i][j] & 1) == 1) {
                    ret++;
                }
            }
        }
        return ret;                
    }
}