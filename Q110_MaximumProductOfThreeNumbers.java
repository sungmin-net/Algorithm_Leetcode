// https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
    public int maximumProduct(int[] nums) {
        int firstIdx = 0;
        int first = nums[0];
        for (int i = 0 ; i < nums.length ; i++) {
            if (Math.abs(first) < Math.abs(nums[i])) {
                firstIdx = i;
                first = nums[i];
            }
        }
        System.out.println(first + "/" + firstIdx);
        int secondIdx = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0 ; i < nums.length ; i++) {
            if (i == firstIdx) {
                continue;
            }
            if (secondIdx == Integer.MIN_VALUE) {
                secondIdx = i;
                second = nums[i];
            }
            if (Math.abs(second) < Math.abs(nums[i])) {
                secondIdx = i;
                second = nums[i];
            }
        }
        System.out.println(second + "/" + secondIdx);
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0 ; i < nums.length ; i++) {
            if (firstIdx == i || secondIdx == i) {
                continue;
            }
            maxProduct = Math.max(maxProduct, first * second * nums[i]);
        }
        return maxProduct;
    }
}