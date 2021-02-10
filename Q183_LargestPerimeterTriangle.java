// https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int ret = 0;
        for (int i = A.length - 1 ; i >= 2 ; i--) {
            if (A[i] >= A[i - 1] + A[i - 2]) {
                continue;
            }
            ret = Math.max(ret, A[i] + A[i - 1] + A[i - 2]);
        }
        return ret;                
    }
}