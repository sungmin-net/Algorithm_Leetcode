// https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {
        char[] xorArray = Integer.toBinaryString(x^y).toCharArray();
        int count = 0;
        for (char c : xorArray) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}