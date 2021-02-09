// https://leetcode.com/problems/image-smoother/

class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] ret = new int[M.length][M[0].length];
        for (int i = 0 ; i < M.length ; i++) {
            for (int j = 0 ; j < M[0].length ; j++) {
                int count = 0;
                int sum = 0;
                for (int k = i - 1 ; k <= i + 1 ; k++) {
                    for (int l = j - 1 ; l <= j + 1 ; l++) {
                        if (k < 0 || k == M.length || l < 0 || l == M[0].length) {
                            continue;
                        }
                        sum += M[k][l];
                        count++;
                    }
                }
//                System.out.println("i : " + i + ", j : " + j + ", count : " + count + ", sum : " + sum);
                ret[i][j] = sum / count;
            }
        }
        return ret;                        
    }
}