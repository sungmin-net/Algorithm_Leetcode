// https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int carry = 0;
        int i = A.length - 1;
        List<Integer> ret = new ArrayList<Integer>();
        while (K > 0 || i >= 0 || carry != 0) {
            int cur = (K % 10) + carry;
            carry = 0;
            if (i >= 0) {
                cur += A[i];
            }
            if (cur >= 10) {
                carry = cur / 10;
                cur %= 10;
            }
            K /= 10;
            i--;
            ret.add(0, cur);
        }
        return ret;
    }
}