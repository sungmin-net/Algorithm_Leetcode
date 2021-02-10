// https://leetcode.com/problems/binary-prefix-divisible-by-5/

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        if (A == null || A.length == 0) {
            return new ArrayList<>();
        }
        int sum = 0;
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0 ; i < A.length ; i++) {
            sum = sum * 2 + A[i];
            if (sum % 5 == 0) {
                ret.add(true);
            } else {
                ret.add(false);
            }
            sum = sum % 5;
        }
        return ret;
    }
}