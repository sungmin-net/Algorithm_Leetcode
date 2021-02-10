// https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int N) {
        String s = Integer.toBinaryString(N);
        int ret = 0;
        for (char c : s.toCharArray()) {
            ret <<= 1;
            if (c == '0') {
                ret++;
            }
        }
        return ret;                
    }
}