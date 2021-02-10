// https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;
        while (sIdx < s.length() && tIdx < t.length()) {
            if (s.charAt(sIdx) != t.charAt(tIdx)) {
                tIdx++;
                continue;
            }
            sIdx++;
            tIdx++;
        }
        return sIdx == s.length();               
    }
}