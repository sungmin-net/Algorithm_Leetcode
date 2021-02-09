// https://leetcode.com/problems/count-binary-substrings/

class Solution {
    public int countBinarySubstrings(String s) {
        int curLength = 1;
        int prevLength = 0;
        int groups = 0;
        for (int i = 1 ; i < s.length() ; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curLength++;
            } else {
                prevLength = curLength;
                curLength = 1;
            }
            if (prevLength >= curLength) {
                groups++;
            }
        }
        return groups;
    }
}