// https://leetcode.com/problems/smallest-range-i/

class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : A) {
            max = Math.max(a, max);
            min = Math.min(a, min);            
        }
        if ((max - min) <= (K * 2)) {
            return 0;
        }
        return (max - K) - (min + K);
    }
}