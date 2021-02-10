// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int s = -1;
        int b = -1;
        boolean isFound = false;
        for (int i = 0 ; i < len ; i++) {            
            for (int j = i+1 ; j < len ; j++) {
                if (nums[i] + nums[j] == target) {
                    isFound = true;
                    s = i;
                    b = j;
                    break;
                }                
            }
            if (isFound) {
                break;
            }
        }
        return new int[]{s, b};
    }
}