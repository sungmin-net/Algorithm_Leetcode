// https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;

        if (nums.length <= k) {
            for (int i : nums) {
                max += i;
            }
            return max / k;
        }

        for (int i = 0 ; i < k ; i++) {
            max += nums[i];
        }

        double cur = 0;
        for (int i = 1 ; i <= nums.length - k ; i++) {
            for (int j = i ; j < i + k ; j++) {
                cur += nums[j];
            }
//            System.out.println("i : " + i + ", max : " + max + " , cur : " +  cur);
            max = Math.max(max, cur);
            cur = 0;
        }

        return max / k;
    }
}