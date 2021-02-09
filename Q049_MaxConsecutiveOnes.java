// https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSeq = 0;
        int curSeq = 0;
        for (int n : nums) {
            if (n == 1) {
                curSeq++;
            } else {
                curSeq = 0;
            }
            maxSeq = Math.max(maxSeq, curSeq);
        }
        return maxSeq;                
    }
}