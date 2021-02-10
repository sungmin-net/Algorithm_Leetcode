// https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int i : nums) {
            totalSum += i;
        }

//        System.out.println(total);

        int leftSum = 0;
        int pivotIdx = -1;
        for (int i = 0 ; i < nums.length ; i++) {
            if (totalSum - nums[i] == leftSum) {
                return i;
            }
            leftSum += nums[i];
            totalSum -= nums[i];
        }

        return pivotIdx;
    }
}