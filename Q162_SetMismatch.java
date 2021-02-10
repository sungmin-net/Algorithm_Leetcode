// https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ret = new int[2];
        int len = nums.length;
        int sum = 0;
        boolean isFound = false;
        HashSet set = new HashSet<Integer>();
        for (int i : nums) {
            sum += i;
            if (!isFound) {
                if (set.contains(i)) {
                    ret[0] = i;
                    isFound = true;
                } else {
                    set.add(i);
                }
            }
        }
        int sumToBe = (len * (len + 1)) / 2;
        ret[1] = sumToBe - (sum - ret[0]);
        return ret;
    }
}