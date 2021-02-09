// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = {0, 0};
        if (target == 0 || numbers.length == 2) {
            ret[0] = 1;
            ret[1] = 2;
            return ret;
        }
        if (target == numbers[ numbers.length - 1]) {
            ret[0] = 1;
            ret[1] = numbers.length;
            return ret;
        }
        boolean isFound = false;
        for (int i = 0 ; i < numbers.length - 1 ; i++) {
            for (int j = i + 1 ; j < numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                    isFound = true;
                }
                if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return ret;
    }
}