// https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int len = points.length;
        if (len <= K) {
            return points;
        }
        // sort
        for (int i = 0 ; i < len - 1 ; i++) {
            for (int j = 0 ; j < len - i - 1 ; j++) {
                int x1 = points[j][0];
                int y1 = points[j][1];
                int x2 = points[j+1][0];
                int y2 = points[j+1][1];
                if ((x1 * x1) + (y1 * y1) > (x2 * x2) + (y2 * y2)) {
                    // swap
                    int[] tmp = new int[2];
                    tmp = points[j];
                    points[j] = points[j+1];
                    points[j+1] = tmp;
                }
            }
        }
        int[][] ret = new int[K][2];
        for (int i = 0 ; i < K ; i++) {
            ret[i] = points[i];
        }
        return ret;                
    }
}