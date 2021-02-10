// https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val) {
            return 0;
        } else if (nums.length == 1 && nums[0] != val) {
            return 1;
        }
        int startIdx = 0;
        int endIdx = nums.length - 1;
        while (startIdx < endIdx) {
            while (nums[startIdx] != val && startIdx < nums.length - 1) {
                startIdx++;
            }
            while (nums[endIdx] == val && endIdx > 0) {
                endIdx--;
            }
            // swap
            if (startIdx < endIdx) {
                nums[startIdx] ^= nums[endIdx];
                nums[endIdx] ^= nums[startIdx];
                nums[startIdx] ^= nums[endIdx];
            }
        }        
        return (startIdx == 0)? 0 : endIdx + 1;
    }
}