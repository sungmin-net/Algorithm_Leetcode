// https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0 ; i < A.length ; i++) {
            if (A[i] > max) {
                max = A[i];
                index = i;
            }
        }
        return index;
    }
}