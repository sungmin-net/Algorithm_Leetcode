// https://leetcode.com/problems/range-sum-query-immutable/

class NumArray {

    int[] cal;

    public NumArray(int[] nums) {
        cal = new int[ nums.length ];
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            cal[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return cal[j];
        }
        return cal[j] - cal[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */