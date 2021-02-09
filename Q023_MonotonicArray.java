// https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] A) {
        boolean isIncremental = true;
        if (A[0] > A[ A.length - 1]) {
            isIncremental = false;
        }
        boolean isMonotonic = true;
        if (isIncremental) {
            for (int i = 0 ; i < A.length - 1 ; i++) {
                if (A[i] > A[ i + 1 ]) {
                    isMonotonic = false;
                    break;
                }
            }
        } else {
            for (int i = 0 ; i < A.length - 1 ; i++) {
                if (A[i] < A[ i + 1 ]) {
                    isMonotonic = false;
                }
            }
        }
        return isMonotonic;        
    }
}