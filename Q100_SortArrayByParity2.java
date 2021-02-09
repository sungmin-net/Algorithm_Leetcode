// https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int oddIdx = 1;
        int evenIdx = 0;
        while (oddIdx <= A.length && evenIdx <= A.length) {
            while (oddIdx < A.length && (A[ oddIdx ] & 1) != 0) {
                oddIdx += 2;
            }
            while (evenIdx < A.length && (A[ evenIdx ] & 1) == 0) {
                evenIdx += 2;
            }
            if (oddIdx <= A.length && evenIdx <= A.length) {
                A[oddIdx] ^= A[evenIdx];
                A[evenIdx] ^= A[oddIdx];
                A[oddIdx] ^= A[evenIdx];
            }
        }
        return A;                
    }
}