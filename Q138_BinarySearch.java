// https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        int startIdx = 0;
        int endIdx = nums.length - 1;
        while (startIdx < endIdx) {
            if (nums[startIdx] == target) {
                return startIdx;
            }
            if (nums[endIdx] == target) {
                return endIdx;
            }
            if (startIdx + 1 == endIdx) {
                break;
            }            
            int midIdx = startIdx + ((endIdx - startIdx) / 2);
            if (nums[midIdx] == target) {
                return midIdx;
            }
            if (nums[midIdx] < target) {
                startIdx = midIdx;
            } else {
                endIdx = midIdx;
            }
        }

        return -1;                
    }
}