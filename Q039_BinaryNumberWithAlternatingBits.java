// https://leetcode.com/problems/binary-number-with-alternating-bits/

class Solution {
    public boolean hasAlternatingBits(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return true;
        }

        int lastBit = n % 2;

        while (n > 0) {
            n >>= 1;
            if ((n % 2) == lastBit) {
                return false;
            } else {
                lastBit = (lastBit == 1) ? 0 : 1;
            }
        }

        return true;                
    }
}