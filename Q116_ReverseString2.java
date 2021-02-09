// https://leetcode.com/problems/reverse-string-ii/

class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int nextRev = 0;
        int revStartIdx = 0;
        int revEndIdx = Math.min(k - 1, s.length() - 1);
        while (nextRev < s.length()) {
            while (revStartIdx < revEndIdx) {
                // swap
                chars[revStartIdx] ^= chars[revEndIdx];
                chars[revEndIdx] ^= chars[revStartIdx];
                chars[revStartIdx] ^= chars[revEndIdx];
                revStartIdx++;
                revEndIdx--;
            }
            nextRev += 2 * k;
            revStartIdx = nextRev;
            revEndIdx = Math.min(nextRev + k - 1, s.length() - 1);
        }

        return new String(chars);
    }
}