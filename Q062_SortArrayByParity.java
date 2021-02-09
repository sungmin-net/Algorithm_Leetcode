// https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        if (A.length < 2) {
            return A;
        }
        int oddIdx = 0;
        int evenIdx = A.length - 1;
        while (oddIdx < evenIdx) {
            while (oddIdx < A.length && A[oddIdx] % 2 != 1) {
                oddIdx++;
            }
            while (evenIdx > 0 && A[evenIdx] % 2 != 0) {
                evenIdx--;
            }
            // swap
            if (evenIdx > oddIdx) {
                A[oddIdx] ^= A[evenIdx];
                A[evenIdx] ^= A[oddIdx];
                A[oddIdx] ^= A[evenIdx];
            }
        }
        return A;
    }
}