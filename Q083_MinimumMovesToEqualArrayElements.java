// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

class Solution {
    public int minMoves(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int min = nums[0];
        for (int i = 1 ; i < nums.length ; i++) {
            min = Math.min(min, nums[i]);
        }
        int moves = 0;
        for (int n : nums) {
            moves += n - min;
        }
        return moves;
    }
}