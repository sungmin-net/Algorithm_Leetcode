// https://leetcode.com/problems/longest-continuous-increasing-subsequence/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int run = 1;
        int maxRun = 1;
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i] > nums[i - 1]) {
                run++;
                maxRun = Math.max(run, maxRun);
            } else {
                run = 1;
            }
        }
        return maxRun;                
    }
}