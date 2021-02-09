// https://leetcode.com/problems/number-complement/

class Solution {
    public int findComplement(int num) {
        // 1. XOR with Integer.MAX_VALUE;
        int leadingZeros = Integer.numberOfLeadingZeros(num);

        // 2. cut leading zeros.
        return ((num ^= Integer.MAX_VALUE) << leadingZeros) >> leadingZeros;        
    }
}