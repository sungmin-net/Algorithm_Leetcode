// https://leetcode.com/problems/largest-number-at-least-twice-of-others/

class Solution {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len < 1) {
            return -1;
        }
        if (len == 1) {
            return 0;
        }
        int[] sorted = new int[ len ];
        System.arraycopy(nums, 0, sorted, 0, len);
        Arrays.sort(sorted);
        int max = sorted[ len - 1 ];
        if (max >= sorted[ len - 2] * 2) {
            // find max
            for (int i = 0 ; i < len ; i++) {
                if (max == nums[i]) {
                    return i;
                }
            }

        }
        return -1;        
    }
}