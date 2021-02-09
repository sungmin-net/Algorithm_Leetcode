// https://leetcode.com/problems/fair-candy-swap/

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int totalCandies = 0;
        int aliceCandies = 0;
        int[] ret = new int[ 2 ];
        for (int i = 0 ; i < A.length ; i++) {
            totalCandies += A[i];
            aliceCandies += A[i];
        }
        for (int i = 0 ; i < B.length ; i++) {
            totalCandies += B[i];
        }
        int candyForEach = totalCandies / 2;
        for (int i = 0 ; i < A.length ; i++) {
            boolean isFound = false;
            for (int j = 0 ; j < B.length ; j++) {
                if ((aliceCandies - A[i] + B[j]) == candyForEach) {
                    ret[0] = A[i];
                    ret[1] = B[j];
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return ret;                
    }
}