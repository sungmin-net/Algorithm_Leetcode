// https://leetcode.com/problems/sum-of-even-numbers-after-queries/

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ret = new int[ A.length ];
        for (int i = 0 ; i < queries.length ; i++) {
            int[] query = queries[i];
            int curSum = 0;
            A[ query[1] ] += query[ 0 ];
            for (int j : A) {
                if (j % 2 == 0) {
                    curSum += j;
                }
            }
            ret[ i ] = curSum;
        }
        return ret;        
    }
}