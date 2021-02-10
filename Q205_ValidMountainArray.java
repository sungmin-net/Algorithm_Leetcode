// https://leetcode.com/problems/valid-mountain-array/

class Solution {
    public boolean validMountainArray(int[] A) {
        int len = A.length;
        int i = 0;

        while (i + 1 < len && A[i] < A[i+1]) {
            i++;
        }

        if (i == 0 || i == len - 1) {
            return false;
        }

        while (i+1 < len && A[i] > A[i + 1]) {
            i++;
        }

        return i == len - 1;
    }
}