// https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int[] best = new int[ len ];
        best[0] = nums[0];        
        best[1] = Math.max(nums[0], nums[1]);
        for (int i = 2 ; i < len ; i++) {
            if (nums[i] + best[i - 2] >= best[i - 1]) {
                best[i] = nums[i] + best[i - 2];
            } else {
                best[i] = best[i - 1];
            }
        }
        return best[len - 1];                
    }
}