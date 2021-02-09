// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int end = nums.length - 1;
        while (nums[ end ] == 0) {
            end--;
            if (end == -1) {
                return;
            }
        }
//        System.out.println("end : " + end);
        int start = 0;
        while ( start != end ) {
            if (nums[start] == 0) {
                for (int i = start ; i < end ; i++) {
                    nums[ i ] = nums[ i + 1 ];
                }
                nums[ end-- ] = 0;
            } else {
                start++;
            }
        }
    }
}